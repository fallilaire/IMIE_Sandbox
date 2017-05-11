(function (hotel) {
	hotel.id = "";
	hotel.name = "";
	hotel.classement = "";
	hotel.commune = "";
	hotel.code_postal = 0;
	hotel.adresse = "";
	hotel.dept = "";
	hotel.capacite_d_accueil_personnes = 0; 
	hotel.nombre_de_chambres = 0;
   	
    hotel.init = function (item) {
		hotel.id = item._id,
		hotel.name = item.fields.nom_commercial,
		hotel.classement = item.fields.classement,
		hotel.commune = item.fields.commune,
		hotel.code_postal = item.fields.code_postal,
		hotel.adresse = item.fields.adresse,
		hotel.dept = item.fields.dept,
		hotel.capacite_d_accueil_personnes = item.fields.capacite_d_accueil_personnes, 
		hotel.nombre_de_chambres = item.fields.nombre_de_chambres
		
		return hotel;
	};

})(module.exports);