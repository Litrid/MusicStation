package me.lithid.musicstation.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Station {

    private @Id @GeneratedValue Long id;
    private String name;
    private String channel;
    private String video;
    private String liveStream;

    public Station() {}

    public Station(String name, String channel, String video, String liveStream) {
        this.name = name;
        this.channel = channel;
        this.video = video;
        this.liveStream = liveStream;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return Objects.equals(id, station.id) && Objects.equals(video, station.video) && Objects.equals(name, station.name) && Objects.equals(channel, station.channel) && Objects.equals(liveStream, station.liveStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, video, name, channel, liveStream);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLiveStream() {
        return liveStream;
    }

    public void setLiveStream(String liveStream) {
        this.liveStream = liveStream;
    }
}
