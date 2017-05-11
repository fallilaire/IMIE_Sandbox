var request = require('request');
var hotel = require('../models/hotel.js');
var bodyParser = require('body-parser');
var ObjectID = require('mongodb').ObjectID;

module.exports = function (app) {
    
	app.use(bodyParser.json());
	app.use(bodyParser.urlencoded({ extended: true }));
	
	// /ville
    app.get('/villes', function(req, res) {
    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
           	db.collection('hotels').distinct('fields.code_postal').toArray(function(err, data) {
           		res.render('villes', { data: data });
           	}) ;

    	});
    		
    });
	
	// /ville/:codePostal/hotels (données complètes)
    app.get('/ville/:codepostal/hotels', function(req, res) {
    	var codepostal = parseInt(req.params.codepostal);

    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
           	db.collection('hotels').find( {'fields.code_postal': codepostal}).toArray(function(err, data) {
           		res.send(data);
           	}) ;

    	});
    		
    });
    
    // /hotels/:codePostal/:distance (recherche les hotels à une distance inférieure)
    app.get('/hotels/:codepostal/:distance', function(req, res) {
    	var codepostal = parseInt(req.params.codepostal);
    	var distance = parseInt(req.params.distance);

    	console.log('Not implemented yet');
    	
    	res.send("Not implemented yet!");
    		
    });

    // /hotels/:codePostal/statistiques/moyenne (note moyenne sur la ville)
    app.get('/hotels/:codepostal/statistiques/moyenne', function(req, res) {
    	var codepostal = parseInt(req.params.codepostal);

    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
           	db.collection('hotels').find( {'fields.code_postal': codepostal}, {'_id':0, 'fields.classement': 1}).toArray(function(err, data) {
           		var sommeEtoile = 0;
           		var nbHotels = data.length;
           		for (item of data) {
           			var classement = item.fields.classement;
           			var nbEtoile = parseInt(classement.substring(0,1));
           			sommeEtoile += nbEtoile;
           		}
           		var moyenne = sommeEtoile / nbHotels; 
           		res.send(moyenne.toString());
           	}) ;

    	});
    		
    });

    // /hotels/:codePostal/statistiques/capacite (capacite total d'hébergement sur le CP)
    app.get('/hotels/:codepostal/statistiques/capacite', function(req, res) {
    	var codepostal = parseInt(req.params.codepostal);

    	var mongodb = require('mongodb').MongoClient;

    	mongodb.connect('mongodb://localhost:27017/hotels', function(err, db) {
           	db.collection('hotels').find( {'fields.code_postal': codepostal}, {'_id':0, 'fields.capacite_d_accueil_personnes': 1}).toArray(function(err, data) {
           		
           		var sommeCapacite = 0;
           		for (item of data) {
           			var capacite = parseInt(item.fields.capacite_d_accueil_personnes);
           			sommeCapacite += capacite;
           		}
           		res.send(sommeCapacite.toString());
           	}) ;

    	});
    		
    });
   
}