import './App.css';
import React from 'react';

class App extends React.Component {

  constructor(props) {
      super(props);
      this.state = {
          currentJoke: "Get me a joke!",
          fetching: false
      }
      this.handleNewJoke = this.handleNewJoke.bind(this);
      this.renderButton = this.renderButton.bind(this);
  }

  handleNewJoke(event) {
    event.preventDefault();
    console.log("A new joke is fetching...");
    this.setState({fetching: true})
    fetch("/joke/chucknorries")
        .then(response => response.json())
        .then(data => {
            this.setState({currentJoke: data.description, fetching: false});
            console.log(data);
        });
  }

  renderJoke() {

      if (this.state.fetching) {
          return (<div className={"loader"}></div>);
      } else {
          return (<div className={"joke"}>{this.state.currentJoke}</div>);
      }
  }

  renderButton() {
      return (<button id={"newJokeButton"} className={"jokeButton"} onClick={this.handleNewJoke}>Joke!</button>);
  }

  render() {
    return (
        <div className={"app"}>
          <div className={"jokeBox"}>
              <div className={"jokeContainer"}>{this.renderJoke()}</div>
              <div className={"buttonContainer"}>{this.renderButton()}</div>
          </div>
        </div>
    );
  }
}

export default App;
