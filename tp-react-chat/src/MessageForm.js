import React, { Component } from 'react';
import './App.css';

class MessageForm extends Component {
  constructor(props) {
    super(props);
    this.state = {
      message: ""
    };
  }

  handleSubmit(e) {
    e.preventDefault();
    this.props.onSend(this.state.message);

    this.setState({
      message: ""
    });
  }

  handleChange(e) {
    this.setState({
      message: e.target.value
    });
  }

  render() {
    return (
      <div>
        <form onSubmit={ this.handleSubmit.bind(this) }>
          <input type="text" placeholder="Message..."
            value={this.state.message}
            onChange={this.handleChange.bind(this)}
          />
          <button>Send</button>
        </form>
      </div>
    );
  }
}

MessageForm.propTypes = {
  onSend: React.PropTypes.func.isRequired
}

export default MessageForm;
