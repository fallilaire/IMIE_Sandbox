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

var varTimeout;

function init() {
  document.getElementById("startBtn").addEventListener("click", startButton);
  document.getElementById("stopBtn").addEventListener("click", stopButton);
  document.getElementById("prevBtn").addEventListener("click", previousButton);
  document.getElementById("nextBtn").addEventListener("click", nextButton);
}

/**
 * Functions added by control buttons
 */
function startButton() {
  clearTimeout(varTimeout);
  window.monIndexSlider = 0;
  displayImg();
  varTimeout = window.setTimeout( sliderPlay, 1000);
}

function stopButton() {
  clearTimeout(varTimeout);
  var slider = document.getElementById('slider');
  slider.setAttribute("src", "");
}

function previousButton() {
  window.monIndexSlider = window.monIndexSlider - 2;
  clearTimeout(varTimeout);
  displayImg();
  varTimeout = window.setTimeout( sliderPlay, 1000);
}

function nextButton() {
  clearTimeout(varTimeout);
  displayImg();
  varTimeout = window.setTimeout( sliderPlay, 1000);
}

/**
 * Utility functions
 */
function sliderPlay() {
  displayImg();
  varTimeout = window.setTimeout( sliderPlay, 1000);
}

function displayImg() {
  var slider = document.getElementById('slider');
  slider.setAttribute("src", getImg());
}

function getImg() {
  if (window.monIndexSlider < 0) {
    window.monIndexSlider = imgs.length - 1;
  }
  else if (window.monIndexSlider < imgs.length-1) {
    window.monIndexSlider++;
  }
  else {
    window.monIndexSlider = 0;
  }
  return imgs[window.monIndexSlider];
}
