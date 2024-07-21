package dev.buskopan.point_of_interest.service;

import dev.buskopan.point_of_interest.controller.dto.PoiDTO;
import dev.buskopan.point_of_interest.model.Poi;

import java.util.List;

public interface PoiService {
    Poi create(PoiDTO poiDTO);
    List<Poi> listAll();
    List<Poi> listNear(double x, double y, double dMax);
}
