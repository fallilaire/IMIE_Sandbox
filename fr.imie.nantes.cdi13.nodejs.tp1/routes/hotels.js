var request = require('request');
var hotel = require('../models/hotel.js');
var bodyParser = require('body-parser');
var ObjectID = require('mongodb').ObjectID;

module.exports = function (app) {
    
	app.use(bodyParser.json());
	app.use(bodyParser.urlencoded({ extended: true }));
	
    // /hotels (nom / nombre d'étoiles)
    app.get('/hotels', function(req, res) {
    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
//           	db.collection('hotels').find({}, {_id : 1, 'fields.nom_commercial': 1, 'fields.classement' : 1}).toArray(function(err, data) {
           	db.collection('hotels').find({}).toArray(function(err, data) {
/*
           		var hotelsList = [];
           		for (item of data) {
           			var currentHotel = hotel.init(item);
           			console.log(currentHotel.name);
           			hotelsList.push(currentHotel);
           		}
*/
           		res.render('hotels', { data: data });
           	});

    	});
    		
    });
    
 // /hotel/:id (données complètes)
    app.get('/hotel/:id', function(req, res) {
    	var userId = req.params.id;

    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
           	db.collection('hotels').find( {'_id': new ObjectID(userId)}).toArray(function(err, data) {
           		var currentHotel = hotel.init(data[0]);
           		res.render('hotel', { data: currentHotel });
           	}) ;

    	});

    });
    
    app.get('/init', function(req, res){
    	console.log('Tentative init de la base');
    	var mongodb = require('mongodb').MongoClient;

    	var arr = require('./hotels.json');

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
        	for (var idx in arr) {
            	db.collection('hotels').insert(arr[idx]);
        	}
        	console.log('Import over');
    	});
    });

    app.get('/clean', function(req, res){
    	console.log('Tentative init de la base');
    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
    		db.collection('hotels').drop();
        	console.log('Drop hotels!');
    	});
    });

    // POST /hotel/:id/comment => ajoute un commentaire
    app.post('/hotel/:id/comment', function(req, res) {
    	var hotelId = req.params.id;
    	var author = req.body.author;
    	var content = req.body.content;

    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {		
       		var comment = {
           		author : author,
//           		date : date,
           		content : content,
           		hotelId : hotelId
       		}
        	db.collection('comments').insert(comment);
       		res.send('Votre commentaire a été ajouté');
    	});
    	
    });

    // GET /hotel/:id/comments => liste des commentaires
    app.get('/hotel/:id/comments', function(req, res) {
    	var hotelId = req.params.id;
    	
    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
           	db.collection('comments').find( {'hotelId': hotelId}).toArray(function(err, data) {
           		res.render('comment', { data: data });
           	}) ;

    	});

    });
    
}