import React, { Component } from 'react';
import './App.css';
import MessageForm from './MessageForm.js';
import MessagesList from './MessagesList.js';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      messages : [],
      isConnected : false,
      nick : ''
    };
  }

  componentWillMount() {
    this.socket = require('socket.io-client')('http://localhost:1337');

    this.socket.on('msg', function(data){
      this.setState({
        messages: [...this.state.messages, data]
      });
    }.bind(this));

    this.socket.on('disconnect', function(){

    });
  }

  componentWillUnmount() {
    this.socket.close();
  }

  handleSend(message) {
    if (message === 'users') {
      this.socket.emit('users', '');
    }
    else {
      this.socket.emit('msg', {nick: this.state.nick, text: message});
    }
  }

  handleLoginChange(event) {
    this.setState({
      nick: event.target.value
    });
  }

  handleLoginSubmit(event) {
    event.preventDefault();
    this.setState({
      isConnected: true
    });
    this.socket.emit('nick', this.state.nick); 
  }

  render() {
    const isLoggedIn = this.state.isConnected;
    if (!isLoggedIn) {
      return ( 
          <form onSubmit={this.handleLoginSubmit.bind(this)}>
            <input type="text" placeholder="Login..." onChange={this.handleLoginChange.bind(this)} />
            <button>Send</button>
          </form>
      )
    }
    else {
      return (
        <div>
          <div>Hello {this.state.nick}</div>
          <MessagesList messages={this.state.messages}/>
          <MessageForm onSend={ this.handleSend.bind(this) } />
        </div>
      )
    }
  }
}

export default App;
