import { useEffect, useState } from 'react'
import StationList from './components/StationList';
import ReactPlayer from 'react-player';
import Controls from './components/Controls';
import github_logo from './images/github.png'
import youtube_logo from './images/youtube.png'

function App() {
  const [stations, setStations] = useState([])
  const [station, setStation] = useState(null);
  const [playing, setPlaying] = useState(true)
  const [volume, setVolume] = useState(0.35)
  useEffect(() => {
    fetch("/api/stations")
      .then((res) => res.json())
      .then((json) => {
        setStations(json._embedded.stations)
        setStation(json._embedded.stations[0])
      })
  }, []);

  if (!station) return "Loading...";

  return (
    <div className='w-[98%] h-[97vh] flex flex-row justify-between'>
      <div className='flex flex-col justify-between w-[281px]'>
        <h1 className='logo'>Vibe Station</h1>
        <div className='h-[100%] text-center flex justify-center items-center z-[2] overflow-y-auto'>
          <StationList stations={stations} onClick={setStation} />
        </div>
        <img src={github_logo} className='github_logo' alt='Github Link' onClick={() => window.open("https://github.com/Litrid", "_blank")}></img>
        <div className='absolute -z-[1] h-full w-full -top-[220px] -left-[230px]'>
          <ReactPlayer 
            className='relative overflow-hidden -z-[1]'
            url={station.video} 
            width="140%" 
            height="140%" 
            loop="true"
            playing={playing}
            volume="mute"
          />
        </div>
      </div>
      <ReactPlayer
          width="0%"
          height="0%"
          playing={playing}
          volume={volume}
          url={station.liveStream}
        />
      <div className="absolute left-[46%] bottom-[10%]">
        <Controls pauseOnClick={() => setPlaying(!playing)} sliderOnChange={(value) => setVolume(value)} volume={volume} playing={playing}/>
      </div>
      <div className='relative w-[250px] flex flex-col justify-end items-center'>
        <h1 className='logo'><u>{station.name}</u></h1>
        <img src={youtube_logo} alt="Station Link" onClick={() => window.open(station.channel)} className='youtube_logo'></img>
      </div>
    </div>
  );
}

export default App;
