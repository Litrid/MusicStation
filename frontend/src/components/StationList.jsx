import Station from "./station";

function StationList({ stations, onClick }) {
  const stationList = stations.map((station) => 
    <Station 
      name={station.name} 
      onClick={() => onClick({name: station.name, channel: station.channel, video: station.video, liveStream: station.liveStream})} 
    />
  );
    
  return (
    <div className="flex flex-col items-start mr-[3px] space-y-2">
      {stationList}
    </div>
  );
}

export default StationList;