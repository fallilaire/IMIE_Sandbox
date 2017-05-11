var imgs = [
  'http://maxi18.com/media/com_easysocial/photos/3002/5099/6995-l_square.jpg',
  'http://38.media.tumblr.com/avatar_8f1ac442d592_128.png',
  'http://papillonvolant.p.a.pic.centerblog.net/s1vh7z1n.jpg',
  'https://33.media.tumblr.com/avatar_17135998b3f5_128.png',
  'https://33.media.tumblr.com/avatar_52e80e3ad564_128.png',
  'http://38.media.tumblr.com/avatar_1d84667d2b3a_128.png',
  'http://38.media.tumblr.com/avatar_77caa9553877_128.png',
  'http://ediogames.com/uploaded_files/avatars/a54b5695412c7e55d449f1146cd2a6ab128.png'
];

function init() {
  document.getElementById("startBtn").addEventListener("click", startButton());
  document.getElementById("stopBtn").addEventListener("click", stopButton());
  document.getElementById("prevBtn").addEventListener("click", previousButton());
  document.getElementById("nextBtn").addEventListener("click", nextButton());
}

function startButton() {
  window.monIndexSlider = 0;
  sliderPlay(function() {return imgs[0];});
}

function stopButton() {
  delete window.monIndexSlider;
  sliderPlay(function() {return "";});
}

function nextButton() {
  sliderPlay(function(index) {
    if (index >= imgs.length -1) {
      index = 0;
    }
    else {
      index++;
    }
    window.monIndexSlider = index;
    return imgs[index];
  });
}

function previousButton() {
  sliderPlay(function(index) {
    if (index <= 0) {
      index = imgs.length -1;
    }
    else {
      index--;
    }
    window.monIndexSlider = index;
    return imgs[index];
  });
}

function sliderPlay(myFunction) {
  var slider = document.getElementById('slider');

  for (attribute of slider.attributes) {
    if (attribute.name === "src") {
      if (typeof(window.monIndexSlider) !== 'undefined') {
        attribute.value = myFunction(window.monIndexSlider);
      }
      else {
        console.log("Create");
        window.monIndexSlider = 0;
        attribute.value = myFunction(window.monIndexSlider);
      }
    }
  }
}
