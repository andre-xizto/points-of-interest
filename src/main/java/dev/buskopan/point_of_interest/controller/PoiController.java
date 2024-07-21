package dev.buskopan.point_of_interest.controller;

import dev.buskopan.point_of_interest.controller.dto.PoiDTO;
import dev.buskopan.point_of_interest.model.Poi;
import dev.buskopan.point_of_interest.service.PoiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoiController {
    private final PoiService poiService;

    public PoiController(PoiService poiService) {
        this.poiService = poiService;
    }

    @RequestMapping("/create")
    @PostMapping
    public ResponseEntity<?> create(@RequestBody PoiDTO dto) {
        Poi poi = poiService.create(dto);
        PoiDTO poiResponse = new PoiDTO(poi.getName(), poi.getX(), poi.getY());
        return ResponseEntity.status(HttpStatus.CREATED).body(poiResponse);
    }
}
