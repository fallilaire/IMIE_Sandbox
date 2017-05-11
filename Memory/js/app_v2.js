var imgs = [
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img1.jpg',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img2.png',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img3.png',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img4.png',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img5.png',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img6.png',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img7.png',
  'C:/Users/Freddy/git/IMIE/Javascript/Slider/img/img8.jpg'
];

function Memory() {
  this.cadre;
  this.nbFlipCards = 0;
  this.firstFlippedCard;
}

Memory.prototype.init = function () {

  // initialiser le cadre avec les imgs * 2 et mélanger
  this.cadre = shuffle(imgs.concat(imgs));

  for (var index = 0; index < this.cadre.length; index++) {
    var img = $('<img>');
    img.toggleClass('show');
    img.addClass('figure');
    img.attr('id', index);
    img.attr('src', this.cadre[index]);
    img.click(function(e) {
      e.target.classList.toggle('hide');
      e.target.classList.toggle('show');
      window.nbFlipCards++;
      if (window.nbFlipCards == 1) {
        window.firstFlippedCard = cadre[e.target.id];
      }
      else if (window.nbFlipCards >=2 ) {
        if (cadre[e.target.id] == window.firstFlippedCard) {
          window.foundImgs.push(window.firstFlippedCard);
          window.nbFlipCards = 0;
          window.firstFlippedCard = '';
          if (window.foundImgs.length == imgs.length) {
            window.setTimeout(gameOver, '500');
          }
        }
        else {
          window.setTimeout(cleanBoard, '500');
        }
      }
    });
    $('#board').append(img);
  }

}

Memory.prototype.cleanBoard = function () {
  this.nbFlipCards = 0;
  this.firstFlippedCard = '';

  var imgsVar = $('#board')[0].children;

  for (variable of imgsVar) {
    if (this.foundImgs.includes(variable.getAttribute('src')) == false) {
      variable.setAttribute('src', emptyImg);
    }

  }
}

Memory.prototype.gameOver = function () {
  this.init();
}

/**
 * Init game
 */
var game = new Memory();
game.init();

/**
 * Utility functions
 */

function shuffle(cadre) {
  // shuffle my img array
  for (var index = 0; index < cadre.length; index++) {
    var element = cadre[index];
    
    var switchIndex = Math.floor(Math.random()*cadre.length);
    cadre[index] = cadre[switchIndex];
    cadre[switchIndex] = element;
  }
  return cadre;
}
