// Express require and configuration
var express = require('express');
var app = express();
app.set('view engine', 'ejs');

var path = require('path');
app.set('views', path.join(__dirname, 'views/ejs'));

//BodyParser require and configuration
var bodyParser = require('body-parser');
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

//Server setup
var port = process.argv[2] || 1337;
var server = app.listen(port, function() {
	console.log('Server is listening on port ' + port);
});

//GET Home Page
app.get('/', function(req, res){
	res.render('index');
});

// GET /hello-world
app.get('/hello-world', function(req, res){
	res.send('Hello World!');
});

// GET /coucou/:name
app.get('/coucou/:name', function(req, res) {
	var name = req.params.name;
	res.render('coucou', { data: name });
});

// GET /ping?message=text
app.get('/ping', function(req, res) {
	var paramMessage = req.query.message;
	
	var mongodb = require('mongodb').MongoClient;

	mongodb.connect('mongodb://localhost:27017/tp', function(err, db) {		
   		var ping = {
       		message : paramMessage,
       		date : Date.now()
   		}
    	db.collection('ping').insert(ping);
   		res.send('ok');
	});

});

// Form to submit a message via POST method 
app.get('/form', function(req, res) {
	res.render('form');
});

// POST /message
app.post('/message', function(req, res) {
	var auteur = req.body.auteur;
	var message = req.body.message;

	var mongodb = require('mongodb').MongoClient;
	
	mongodb.connect('mongodb://localhost:27017/tp', function(err, db) {		
   		var document = {
       		auteur : auteur,
       		message : message
   		}
    	db.collection('message').insert(document);
   		res.send('ok');
	});

});

// GET /messages
app.get('/messages', function(req, res) {
	var mongodb = require('mongodb').MongoClient;

	mongodb.connect('mongodb://localhost:27017/tp', function(err, db) {
       	db.collection('message').find({}).toArray(function(err, data) {
       		res.render('messages', { data: data });
       	});

	});
		
});

// GET /messages/:auteur
app.get('/messages/:auteur', function(req, res) {
	var auteur = req.params.auteur;
	
	var mongodb = require('mongodb').MongoClient;

	mongodb.connect('mongodb://localhost:27017/tp', function(err, db) {
       	db.collection('message').find({'auteur': auteur}).toArray(function(err, data) {
       		res.render('messages', { data: data, auteur: auteur });
       	});

	});
		
});