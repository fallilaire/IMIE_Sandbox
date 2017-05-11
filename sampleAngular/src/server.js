const express = require ('express');
const path = require('path');
const http = require('http');
const bodyParser = require('body-parser');    // pull information from HTML POST (express4)

const api = require('./server/routes/api')
const app = express();
//const morgan = require('morgan');             // log requests to the console (express4)

//const methodOverride = require('method-override'); // simulate DELETE and PUT (express4)

//const ModuleService = require('./module-service');
//const mService = new ModuleService();

//app.use(morgan('dev'));                                         // log every request to the console
app.use(bodyParser.json());                                     // parse application/json
app.use(bodyParser.urlencoded({extended: false}));
//app.use(methodOverride());

app.use(express.static(path.join(__dirname, '../dist')));

app.use('/api', api);

app.get('*', (req, res) => {
    res.sendFile(path.join(__dirname, '../dist/index.html'));
});

const port = '9484';
app.set('port', port);

const server = http.createServer(app);

server.listen(port, () => console.log('API running on: http://localhost:' + port));
