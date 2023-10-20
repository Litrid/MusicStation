import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  const [station, useStation] = useState({"name" : "1942"})

  useEffect(() => {
    fetch("/api/stations/1")
      .then((res) => res.json())
      .then((json) => useStation(json))
      .catch((error) => console.error("Error: " + error))
  });

  return (
    <>
      <h1>{station.name}</h1>
    </>
  )
}

export default App
