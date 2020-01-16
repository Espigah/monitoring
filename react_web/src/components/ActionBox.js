import React, { useState, useEffect } from "react";
import axios from "axios";

import Button from "@material-ui/core/Button";
import { withStyles } from "@material-ui/core/styles";
import { TextField } from "@material-ui/core";
import { useFetch } from "./useFetch";

const styles = {
  actionBox: {
    padding: "5px",
    marging: "5px",
    display: "flex",
    background: `linear-gradient(to right, #0c0 var(--scroll), transparent 0)`
  }
};

function ActionBox({ classes, buttonLabel, action }) {
  const { data, loading, error, fetchData } = useFetch(action);

  const submit = e => {
    if (loading) {
      return;
    }
    e.preventDefault();
    fetchData();
  };

  return (
    <div className={classes.actionBox}>
      <form noValidate autoComplete="off" onSubmit={submit}>
        {loading}
        <Button variant="contained" type="submit">
          {buttonLabel}
        </Button>
        <TextField
         value={data}
          readonly
          id="outlined-basic"
          label="Response"
          variant="outlined"
        />
      </form>
    </div>
  );
}

export default withStyles(styles)(ActionBox);
