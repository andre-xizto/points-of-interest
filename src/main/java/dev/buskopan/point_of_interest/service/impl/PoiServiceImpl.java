package dev.buskopan.point_of_interest.service.impl;

import dev.buskopan.point_of_interest.controller.dto.PoiDTO;
import dev.buskopan.point_of_interest.model.Poi;
import dev.buskopan.point_of_interest.repository.PoiRepository;
import dev.buskopan.point_of_interest.service.PoiService;

import java.util.List;

public class PoiServiceImpl implements PoiService {
    private final PoiRepository poiRepository;

    public PoiServiceImpl(PoiRepository poiRepository) {
        this.poiRepository = poiRepository;
    }

    @Override
    public Poi create(PoiDTO poiDTO) {
        Poi poi = new Poi(poiDTO.name(), poiDTO.x(), poiDTO.y());
        return poiRepository.save(poi);
    }

    @Override
    public List<Poi> listAll() {
        return poiRepository.findAll();
    }

    @Override
    public List<Poi> listNear(double x, double y, double dMax) {
        double xMin = x - dMax;
        double xMax = x + dMax;
        double yMin = y - dMax;
        double yMax = y + dMax;

        List<Poi> poisWithinBox = poiRepository.findWithinBoundingBox(xMin, xMax, yMin, yMax);
        return poisWithinBox
                .stream()
                .filter(
                        poi -> calculateDistance(poi.getX(), x, poi.getY(), y
                        ) <= dMax)
                .toList();

    }

    private double calculateDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2)));
    }
}
