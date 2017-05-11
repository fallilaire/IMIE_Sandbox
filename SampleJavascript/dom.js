function exo1() {

  // var myLinks = document.getElementsByTagName('a');
  var myLinks = document.links;
  console.log(myLinks);

  for (variable of myLinks) {
    variable.textContent = 'IMIE';
    variable.setAttribute("href", "http://www.google.fr");
    // for (attribute of variable.attributes) {
    //   if (attribute.name === "href") {
    //     attribute.value = "http://www.google.fr";
    //   }
    // }

  }

  // myLinks.forEach(function(element) {
  //   console.log("<li>" + element + "</limyLinks");
  // });

  // for (var variable in myLinks) {
  //   console.log(variable.innerText);
  // }

  // for (i = 0; i < myLinks.length; i++) {
  //   console.log(myLinks[i]);
  // }

}

function exo2() {

  /*
    <div id="Exercice 2">
      <p>Liste des cours :</p>
      <ul class="li-menu">
        <li>JavaScript</li>
        <li>Symfony</li>
        <li>Magento</li>
        <li>Phonegap</li>
      </ul>
    </div>
  */

  //var body = document.getElementsByTagName('body').item(0);

  var div = document.createElement('div');
  div.id = "Exercice 2";

  var p = document.createElement('p');
  p.textContent = "Liste des cours :";
  div.appendChild(p);

  var ul_menu = document.createElement('ul');
  ul_menu.setAttribute('class', 'li-menu');
  ul_menu.setAttribute('id', 'ul_id');

  var liJS = document.createElement('li');
  liJS.appendChild(document.createTextNode('JavaScript'));
  ul_menu.appendChild(liJS);

  var liSy = document.createElement('li');
  liSy.textContent = 'Magento';
  ul_menu.appendChild(liSy);

  var liPh = document.createElement('li');
  liPh.textContent = 'Phonegap';
  ul_menu.appendChild(liPh);

  div.appendChild(ul_menu);

  document.body.appendChild(div);

  console.log(document.body);

}
/*
Exo 3
*/
function startExo3() {
  exo3(document.getElementById('ul_id'));
}

function exo3(element) {
  for (var i = element.children.length - 1; i > -1; i--) {
    var newNode = element.children[i].cloneNode(true);
    element.removeChild(element.children[i]);
    element.appendChild(newNode);
  }
}

/*
Exo 4
*/
function exo4() {
  var monTab = [
    {nom : "Processeur", prix : 154.99},
    {nom : "Carte Graphique", prix : 249.99},
    {nom : "Ecran", prix : 200},
    {nom : "Souris", prix : 10},
    {nom : "Clavier", prix : 50}
  ];
  subExo4(document.getElementById("div_exo4"), monTab);
}
/*
  element : element HTML qui va recevoir le tableau
  tab : structure d'objets qui va être affichée sous forme de tableau
*/
function subExo4(element, tab) {
  var table = document.createElement('table');

  var tr = document.createElement('tr');
  for (var prop in tab[0]) {
    var th = document.createElement('th');
    th.textContent = prop;
    tr.appendChild(th);
  }
  table.appendChild(tr);

  for (variable of tab) {
    var tr = document.createElement('tr');
    for (var prop in variable) {
      var td = document.createElement('td');
      td.textContent = variable[prop];
      tr.appendChild(td);
    }
    table.appendChild(tr);
  }
  element.appendChild(table);
}

/*
Exo 5
*/
function exo5() {
  var tab = [document];
  subExo4(document.body, tab);

  // for (var prop in document) {
  //   console.log("document." + prop + " = " + document[prop]);
  // }

}
