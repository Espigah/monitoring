import React from "react";
import "./App.css";

import { ThemeProvider } from "@material-ui/core";
import { withStyles } from "@material-ui/core/styles";
import ActionBox from "./components/ActionBox";

const styles = () => ({
  root: {}
});

const theme = {
  background: "linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)"
};

function App() {
  return (
    <ThemeProvider uiTheme={theme} >
      <div className="App">
        <ActionBox buttonLabel="Spring" action="/spring/"></ActionBox>
        <ActionBox buttonLabel="Micronaut" action="/micronaut/"></ActionBox>
      </div>
    </ThemeProvider>
  );
}

export default withStyles(styles)(App);
