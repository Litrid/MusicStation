package me.lithid.musicstation.loaders;

import me.lithid.musicstation.objects.Station;
import me.lithid.musicstation.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StationLoader implements CommandLineRunner {

    private final StationRepository repository;

    @Autowired
    public StationLoader(StationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Station(
                "LofiGirl",
                "https://www.youtube.com/channel/UCSJ4gkVC6NrvII8umztf0Ow",
                "www.youtube.com/embed/TURbeWK2wwg?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=jfKfPfyJRdk&ab_channel=LofiGirl"
        ));
        this.repository.save(new Station(
                "Ambient Renders",
                "https://www.youtube.com/channel/UCXbXfisDHV_gDjawCKTyTIw",
                "www.youtube.com/embed/hBGbt2CRDpA?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=CoP5wLD9clU&ab_channel=AmbientRenders"
        ));
        this.repository.save(new Station(
                "Ivy Records",
                "https://www.youtube.com/channel/UCv7qaGzuEfLhKxAZf4eZONg",
                "www.youtube.com/embed/F1B9Fk_SgI0?autoplay=1&mute=1&start=10",
                "https://www.youtube.com/watch?v=05689ErDUdM"
        ));
        this.repository.save(new Station(
                "ChillHop Music",
                "https://www.youtube.com/c/Chillhopdotcom/videos",
                "www.youtube.com/embed/iEGFFyv0MH4?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=7NOSDKb0HlU&ab_channel=ChillhopMusic"
        ));
        this.repository.save(new Station(
                "LofiBoy",
                "https://www.youtube.com/@LofiGirl",
                "www.youtube.com/embed/TlWYgGyNnJo?autoplay=1&mute=1&start=19",
                "https://www.youtube.com/watch?v=4xDzrJKXOOY&ab_channel=LofiGirl"
        ));
        this.repository.save(new Station(
                "ChillAF",
                "https://www.youtube.com/c/CHILLAF",
                "www.youtube.com/embed/X9fH2VEFgwk?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=7bSlyM1allk&ab_channel=CHILLAF"
        ));
        this.repository.save(new Station(
                "Astral Throb",
                "https://www.youtube.com/c/AstralThrob",
                "www.youtube.com/embed/RJcIzUNKSQk?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=UedTcufyrHc&ab_channel=NightrideFM"
        ));
        this.repository.save(new Station(
                "Chilled Cow",
                "https://www.youtube.com/c/LofiGirl",
                "www.youtube.com/embed/lTRiuFIWV54?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=rUxyKA_-grg&ab_channel=LofiGirl"
        ));
        this.repository.save(new Station(
                "The Jazz Hop Café",
                "https://www.youtube.com/c/TheJazzHopCaf%C3%A9",
                "www.youtube.com/embed/U8HBZOTZrf0?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=lP26UCnoH9s"
        ));
        this.repository.save(new Station(
                "Nice Guys",
                "https://www.youtube.com/channel/UCMmt12UKW571UWtJAgWkWqg",
                "www.youtube.com/embed/3n1aC2TYXIA?autoplay=1&mute=1&start=1",
                "https://www.youtube.com/watch?v=AS_x4uR87Kw"
        ));
        this.repository.save(new Station(
                "College Music",
                "https://www.youtube.com/@CollegeMusic",
                "www.youtube.com/embed/epaP2LCCuVE?autoplay=1&mute=1&start=0",
                "https://www.youtube.com/watch?v=epaP2LCCuVE"
        ));
        this.repository.save(new Station(
                "Tokyo Tones",
                "https://www.youtube.com/@TokyoTones",
                "www.youtube.com/embed/5wRWniH7rt8?autoplay=1&mute=1&start=50",
                "https://www.youtube.com/watch?v=Lcdi9O2XB4E&ab_channel=TOKYOTONES"
        ));
    }
}
