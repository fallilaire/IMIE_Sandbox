import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import './MessageForm.js';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      compteur: 0
    }
    console.log("App: constructor");
    console.log("App: props = ", props);
  }

  componentWillMount() {
    console.log("App: componentWillMount")
  }
  componentDidMount() {
    console.log("App: componentDidMount")
  }

  handleClickButton() {
//    console.log("Click", this);
    this.setState({
      compteur: this.state.compteur + 1
    });
  }

  render() {
    console.log("App render")
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2 style={{
            color: this.props.color,
            textDecoration: "underline"
          }}>Bonjour React</h2>
        </div>
        <p className="App-intro">
          Compteur :<br />
          <span>{this.state.compteur}</span>
          <button onClick={ this.handleClickButton.bind(this)}>+</button>
        </p>
        <div>
          <MessageForm></MessageForm>
        </div>
      </div>
    );
  }
}

export default App;
