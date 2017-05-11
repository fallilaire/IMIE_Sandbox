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

var emptyImg = 'C:/Users/Freddy/git/IMIE/Javascript/Memory/empty.png';
var cadre;
window.nbFlipCards = 0;
window.firstFlippedCard;
window.foundImgs = new Array();

init();

function init() {
  // initialiser le cadre avec les imgs
  cadre = imgs.concat(imgs);

  // shuffle my img array
  for (var index = 0; index < cadre.length; index++) {
    var element = cadre[index];
    
    var switchIndex = Math.floor(Math.random()*cadre.length);
    cadre[index] = cadre[switchIndex];
    cadre[switchIndex] = element;
  }

  for (var index = 0; index < cadre.length; index++) {
    var img = $('<img>');
    img.attr('src', emptyImg);
    img.attr('id', index);
    img.click(function(e) {
      e.target.setAttribute('src', cadre[e.target.id]);
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

function cleanBoard() {
  window.nbFlipCards = 0;
  window.firstFlippedCard = '';

  var imgsVar = $('#board')[0].children;

  for (variable of imgsVar) {
    if (window.foundImgs.includes(variable.getAttribute('src')) == false) {
      variable.setAttribute('src', emptyImg);
    }

  }
}

function gameOver() {
  window.nbFlipCards = 0;
  window.firstFlippedCard = '';
  window.foundImgs = Array();

  var imgsVar = $('#board')[0].children;

  for (variable of imgsVar) {
    variable.setAttribute('src', emptyImg);
  }
}