package dev.buskopan.point_of_interest.repository;

import dev.buskopan.point_of_interest.model.Poi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoiRepository extends JpaRepository<Poi, Long> {
}
