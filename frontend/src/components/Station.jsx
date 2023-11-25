function Station({ name, onClick }) {
  return <button onClick={onClick}>{name}</button>;
}

export default Station;