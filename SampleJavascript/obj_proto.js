/*
  Exo 1
*/
function exo1() {

  var monObjet = new Object();
  monObjet.sample = "blabla";
  monObjet.sample2 = function() {
    console.log(this.sample);
  }
  // Test
  monObjet.sample2();

  var monObjet2 = {
    nom : "Babar",
    sayHey : function() {
      console.log("I'm " + this.nom + "!");
    }
  }
  monObjet2.sayHey();

}
