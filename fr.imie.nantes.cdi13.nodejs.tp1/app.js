var express = require('express');
var app = express();
var path = require('path');

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views/ejs'));

var port = process.argv[2] || 1337;

var server = app.listen(port, function() {
	console.log('Server is listening on port ' + port);
});

app.get('/', function(req, res){
	res.send('Hello World!');
});

//load express app routes 
require('./routes/hotels.js')(app);
require('./routes/ville.js')(app);