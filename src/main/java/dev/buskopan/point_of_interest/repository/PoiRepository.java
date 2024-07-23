package dev.buskopan.point_of_interest.repository;

import dev.buskopan.point_of_interest.model.Poi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PoiRepository extends JpaRepository<Poi, Long> {
    @Query(value = "SELECT p FROM Poi p WHERE p.x >= :xMin AND p.x <= :xMax AND p.y >= :yMin AND p.y <= :yMax")
    List<Poi> findWithinBoundingBox(double xMin, double xMax, double yMin, double yMax);
}
