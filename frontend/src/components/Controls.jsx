function Controls({ pauseOnClick, sliderOnChange, volume, playing }) {
  return (
    <div className="flex flex-col space-y-2">
      <button onClick={pauseOnClick}>{playing ? "Pause" : "Unpause"}</button>
      <input 
        type="range" 
        min={0}
        max={1}
        value={volume}
        step={0.01}
        onChange={(event) => sliderOnChange(event.target.valueAsNumber)}
      />
    </div>
    
  );
}

export default Controls;