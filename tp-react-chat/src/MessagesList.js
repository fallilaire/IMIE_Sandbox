import React, { Component } from 'react';
import './App.css';
import Message from './Message.js';

class MessagesList extends Component {

  render() {
    const { messages } = this.props;
    return  (
      <ul>
      {
        messages.map(
          (message) => (
            <Message key={message.id} message={message.userId + ' said: ' + message.text} />)
        )
      }
      </ul>
    );
  }
}

MessagesList.propTypes = {
  messages: React.PropTypes.array.isRequired
}


export default MessagesList;
