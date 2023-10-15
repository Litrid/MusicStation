package me.lithid.musicstation.repositories;

import me.lithid.musicstation.objects.Station;
import org.springframework.data.repository.CrudRepository;

public interface StationRepository extends CrudRepository<Station, Long> {
}
