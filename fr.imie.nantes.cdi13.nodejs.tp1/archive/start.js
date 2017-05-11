/**
 * server.js
 */
var http = require('http');
var arr = require('./hotels.json');
//var app = require('express')();

http.createServer(function (req, res) {
	res.writeHead(200, {'Content-Type': 'text/plain'});
	
	var url = req.url;
	var txt = 'Hello World\n';
	txt += "URL: " + url;
	
	if (url.match("/hotels")) {
		var mesHotels = findAll();
		for (variable of mesHotels) {
			txt += variable.prettyPrint();
		}
	}
	else if (url.match("/hotel/")) {
		// /hotel/:id
		
	}
	else if (url.match("/ville/")) {
		// /ville/:codePostal/hotels
		var mesHotels = findAll();
		for (variable of mesHotels) {
			txt += variable.prettyPrint();
		}
	}
	else if (url.match("")) {
		// /hotels/:codePostal/:distance
	
	}
	else if (url.match("")) {
		// /hotels/:codePostal/statistiques/moyenne
		
	}
	else if (url.match("")) {
		// /hotels/:codePostal/statistiques/capacite
	
	}
	else {
		txt += "URL not supported";
	}
	
	res.end(txt);
	
}).listen(1337, '127.0.0.1');

function findAll() {
	var toReturn = [];
	for (var idx in arr) {
		var obj = arr[idx];
		
		var hotel = {
			name : obj.fields.nom_commercial,
			classement : obj.fields.classement,
			commune : obj.fields.commune,
			code_postal : obj.fields.code_postal,
			adresse : obj.fields.adresse,
			dept : obj.fields.dept,
			capacite_d_accueil_personnes : obj.fields.capacite_d_accueil_personnes, 
			nombre_de_chambres : obj.fields.nombre_de_chambres,
			prettyPrint : function () {
				return 'Hotel: ' + this.name + ' with ' + this.classement + '\n';
			}
		}
		toReturn.push(hotel);
	}
	return toReturn;
}

function findFromCP(cp) {
	var toReturn = [];
	for (var idx in arr) {
		var obj = arr[idx];
		
		var hotel = {
			name : obj.fields.nom_commercial,
			classement : obj.fields.classement,
			commune : obj.fields.commune,
			code_postal : obj.fields.code_postal,
			adresse : obj.fields.adresse,
			dept : obj.fields.dept,
			capacite_d_accueil_personnes : obj.fields.capacite_d_accueil_personnes, 
			nombre_de_chambres : obj.fields.nombre_de_chambres,
			prettyPrint : function () {
				return 'Hotel: ' + this.name + ' with ' + this.classement + '\n';
			}
		}
		if (cp == hotel.code_postal) {
			toReturn.push(hotel);
		}
	}
	return toReturn;
}

console.log('Server running at http://127.0.0.1:1337/');

