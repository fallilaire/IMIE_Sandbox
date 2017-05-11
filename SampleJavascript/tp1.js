// Test 1
/*
var a = "Hello You";

function test(truc) {
  document.writeln(truc + "<br />");
}

test(a);
*/
// Test 2
/*
var tab = [1, 2, 3];
document.writeln(tab[2]);
*/
// TP Bases JS
// Exo 1
function tp1_exo1() {

  var life = document.getElementById('life').value;

  if (life >= 100) {
    document.write("En bonne santé");
  }
  else if (life >= 50 && life < 100) {
    document.write("Blessé");
  }
  else if (life > 0 && life < 50) {
    document.write("En danger");
  }
  else {
    document.write("KO");
  }

}
// Exo 2
function tp1_exo2() {

  var nbPhotocop = document.getElementById('id_tp1_exo2').value;

  var total = 0;

  if (nbPhotocop <= 10) {
    total = nbPhotocop * 0.10;
    document.write("Le prix total est de : " + total);
  }
  else if (nbPhotocop <= 30) {
    total = (10 * 0.10) + ((nbPhotocop - 10) * 0.08);
    document.write("Le prix total est de : " + total);
  }
  else if (nbPhotocop > 30) {
    total = (10 * 0.10) + (20 * 0.08) + ((nbPhotocop - 30) * 0.05);
    document.write("Le prix total est de : " + total);
  }
  else {
    document.write("Valeur incorrecte");
  }

}
// Exo 3
function factorielle(facto) {
  if (facto > 1) {
    return factorielle(facto - 1) * facto;
  }
  else {
    return 1;
  }
}


function tp1_exo3() {

  var val = document.getElementById('id_tp1_exo3').value;
  var result = factorielle(val);
  document.write("La factorielle de " + val + " est de : " + result);
}

// Exo 4

function tp1_exo4() {
  document.write("<ul>");
  var tab = [1, 2, 3, "babar", "boumbo"];

  tab.forEach(function(element) {
    document.write("<li>" + element + "</li>");
  });
  document.write("</ul>");
}

// Exo 5
function tp1_exo5() {
  var tabParam = new Array(10,9,8,7,45,5,4,3,2,1);
  tabParam = tri(tabParam);

  for (var ii = 0; ii < tabParam.length; ii++){
	   document.write(tabParam[ii] + "<br />")
  }
}

function tri(myTab) {

  for (var ii = myTab.length-1; ii >= 0;ii--) {
    var temp;
    for (var jj = myTab.length-1; jj >= 0;jj--) {
      if (myTab[jj] < myTab[ii]) {
        temp = myTab[jj];
        myTab[jj] = myTab[ii];
        myTab[ii] = temp;
      }
    }
  }

  return myTab;
}

// Exo 6
function tp1_exo6() {
  var myTab = new Array(10,9,8,7,45,5,4,3,2,1);
  var result = myTab.sort(function(a, b) {return a-b;});
  document.write(result);
}

// Exo 7
function triAndDisplay(tab, myFunction) {
  var display = tri(tab);
  for (var ii = 0; ii < display.length; ii++){
    myFunction(display[ii]);
  }
}

function tp1_exo7() {
  var tabParam = new Array(10,9,8,7,45,5,4,3,2,1);
  triAndDisplay(tabParam, function(myVar) {console.log(myVar + " Youpla !<br />");});
}

// Exo 7bis
/*
Idem exo 7 mais remplacer la fonction d'affichage par le critère de comparaison des 2 éléments pour le tri
 */
function tp1_exo7bis() {
  var tabParam = new Array(10,9,8,7,45,5,4,3,2,1);
  var display = triBis(tabParam,
    function(myVar1, myVar2) {
      if (myVar1 > myVar2) {
        return true;
      }
      else {
        return false;
      }
    }
  );
  for (var ii = 0; ii < display.length; ii++) {
    document.write(display[ii] + "<br />");
  }
}

function triBis(myTab, myFunction) {

  for (var ii = myTab.length-1; ii >= 0;ii--) {
    var temp;
    for (var jj = myTab.length-1; jj >= 0;jj--) {
      if (myFunction(myTab[jj], myTab[ii])) {
        temp = myTab[jj];
        myTab[jj] = myTab[ii];
        myTab[ii] = temp;
      }
    }
  }

  return myTab;
}

// test

function testOperateursSpeciaux() {
  arbres = ['séquoia', 'laurier', 'cèdre', 'chêne', 'érable'];
  if (0 in arbres) {
    console.log("0 in arbres");
  }
  if (6 in arbres) {
    console.log("6 in arbres");
  }
  if ("laurier" in arbres) {
    console.log("laurier in arbres");
  }
  if ("length" in arbres) {
    console.log("length in arbres");
  }
}

// Exo 8

function tp1_exo8() {
  var batman = {
    name : 'Batman',
    saluer : function(qui) {
      console.log(this.name + ": Hello you " + qui + "!");
    },
    realName : 'Bruce Wayne'
  };

  batman.saluer("Babar");

  console.log(batman);

  var monTab = [
    {nom : "Processeur", prix : 154.99},
    {nom : "Carte Graphique", prix : 249.99},
    {nom : "Ecran", prix : 200},
    {nom : "Souris", prix : 10},
    {nom : "Clavier", prix : 50}
  ];

  monTab = monTab.sort(
    function(a,b) {
      if (a.prix > b.prix) return -1;
      else if (a.prix < b.prix) return 1;
      else return 0;
    }
  );

  monTab.forEach(function(element) {
    console.log(element.prix);
  });
}

// Exo 9

function tp1_exo9() {
  var monTab = [
    {nom : "Processeur", prix : 154.99},
    {nom : "Carte Graphique", prix : 249.99},
    {nom : "Ecran", prix : 200},
    {nom : "Souris", prix : 10},
    {nom : "Clavier", prix : 50}
  ];

  monTab = tp1_exo9_subTri(monTab, "nom");

  monTab.forEach(function(element) {
    console.log(element.nom);
  });
}

function tp1_exo9_subTri(monTab, fieldTri) {
  monTab = monTab.sort(
    function(a,b) {
      if (a[fieldTri] < b[fieldTri]) return -1;
      else if (a[fieldTri] > b[fieldTri]) return 1;
      else return 0;
    }
  );
  return monTab;
}
