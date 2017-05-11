// first argument must be an id, second must be an array of images
function Slider(id, imgs, speed){
    this.id = id;
    this.imgs = imgs;
    this.speed = speed;
    this.index = 0;
    this.init();
}

Slider.prototype.init = function () {
    var sliderContainer = document.createElement('div');
    sliderContainer.setAttribute('id','container_'+this.id);

    var controlsContainer = document.createElement('div');
    controlsContainer.appendChild(createButton('startBtn', 'start', startButton.bind(this)));
    controlsContainer.appendChild(createButton('stopBtn', 'stop', stopButton.bind(this)));
    controlsContainer.appendChild(createButton('prevtBtn', 'précédent', previousButton.bind(this)));
    controlsContainer.appendChild(createButton('nextBtn', 'suivant', nextButton.bind(this)));

    sliderContainer.appendChild(document.getElementById(this.id));
    sliderContainer.appendChild(controlsContainer);

    document.body.appendChild(sliderContainer);
}

/*
    Functions for control buttons
 */

function startButton() {
    this.intervalID = window.setInterval(displayImgFromStart.bind(this), this.speed);
}

function stopButton() {
    window.clearInterval(this.intervalID);
    this.index = 0;
    $('#'+this.id).attr("src", "");
}

function previousButton() {
    this.index--;
    displayImg(this);
}

function nextButton() {
    this.index++;
    displayImg(this);
}

/*
    Utility functions
*/
function displayImg(currentSlider) {
    if (currentSlider.index < 0) {
        currentSlider.index = currentSlider.imgs.length - 1;
    }
    else if (currentSlider.index >= currentSlider.imgs.length) {
        currentSlider.index = 0;
    }
    $('#'+currentSlider.id).attr("src", currentSlider.imgs[currentSlider.index]);
}

function displayImgFromStart() {
    displayImg(this);
    this.index++;
}

function createButton(id, name, fct) {
    var btn = document.createElement('button');
    btn.textContent = name;
    btn.setAttribute('id',id);
    btn.addEventListener('click', fct);
    return btn;
}