import { useEffect, useState } from "react";

export const useFetch = url => {
  const [data, setData] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const fetchData = () => {
    setLoading(true);
    setError(null);

    fetch("/uinames/")
      .then(response => {
        return response.json();
      })
      .then(data => {
        const apiUrl = url +  data.name;
        return fetch(apiUrl);
      })
      .then(res => res.text())
      .then(data => {
        setData([data]);
        setLoading(false);
      })
      .catch(err => {
        setError(err);
        setLoading(false);
      });

    // This is important. We pass the new search parameter into
    // the empty array we had before. This means, the effect
    // will run again if this parameter changes
  };

  return { data, loading, error, fetchData };
};
