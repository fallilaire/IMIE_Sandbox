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

var myVar;

function init() {
  $("#startBtn").click(startButton);
  $("#stopBtn").click(stopButton);
  $("#prevBtn").click(previousButton);
  $("#nextBtn").click(nextButton);
}

function startButton() {
  clearTimeout(myVar);
  window.monIndexSlider = 0;
  displayImg();
  myVar = window.setTimeout( sliderPlay, 1000);
}

function stopButton() {
  clearTimeout(myVar);
  $('#slider').attr("src", "");
}

function previousButton() {
  window.monIndexSlider = window.monIndexSlider - 2;
  clearTimeout(myVar);
  displayImg();
  myVar = window.setTimeout( sliderPlay, 1000);
}

function nextButton() {
  clearTimeout(myVar);
  displayImg();
  myVar = window.setTimeout( sliderPlay, 1000);
}

function sliderPlay() {
  displayImg();
  myVar = window.setTimeout( sliderPlay, 1000);
}

function displayImg() {
  $('#slider').attr("src", getImg());
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
