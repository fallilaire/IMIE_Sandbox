var server = require('http').createServer();
var io = require('socket.io')(server);
const uuidV4 = require('uuid/v4');

var users = [];

io.on('connection', function(client){
  client.on('msg', function(data){
    const message = {
        id:uuidV4(), 
        userId: data.nick, 
        text: data.text, 
        date: new Date().getTime()
    };
    io.sockets.emit('msg', message);
  });

  client.on('nick', function(data){
    users = [...users, {id:uuidV4(), nickname: data}];
    var usrConnected = {
        id:uuidV4(), 
        userId: 'Server', 
        text: data + ' is now connected!', 
        date: new Date().getTime()
    };
    io.sockets.emit('msg', usrConnected);
  });

  client.on('users', function(data){
    let users = {
        id:uuidV4(), 
        userId: 'Server', 
        text: data + 'Les users connected', 
        date: new Date().getTime()
    };
    io.sockets.emit('msg', users);
  });

  client.on('disconnect', function(){

  });
});
server.listen(1337);