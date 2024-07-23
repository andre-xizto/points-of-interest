package dev.buskopan.point_of_interest.controller;

import dev.buskopan.point_of_interest.controller.dto.NearRequestDTO;
import dev.buskopan.point_of_interest.controller.dto.PoiDTO;
import dev.buskopan.point_of_interest.model.Poi;
import dev.buskopan.point_of_interest.service.PoiService;
import jakarta.annotation.Nonnull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PoiController {
    private final PoiService poiService;

    public PoiController(PoiService poiService) {
        this.poiService = poiService;
    }

    @PostMapping("/create")
    public ResponseEntity<PoiDTO> create(@RequestBody PoiDTO dto) {
        Poi poi = poiService.create(dto);
        PoiDTO poiResponse = new PoiDTO(poi.getName(), poi.getX(), poi.getY());
        return ResponseEntity.status(HttpStatus.CREATED).body(poiResponse);
    }

    @GetMapping("/list")
    public ResponseEntity<List<PoiDTO>> listAll() {
        List<Poi> pois = poiService.listAll();
        List<PoiDTO> poisResponse = new ArrayList<>();
        pois.forEach(poi -> poisResponse.add(new PoiDTO(poi.getName(), poi.getX(), poi.getY())));
        return ResponseEntity.status(HttpStatus.OK).body(poisResponse);
    }

    @PostMapping("/near")
    public ResponseEntity<List<PoiDTO>> near(@RequestBody NearRequestDTO dto) {
        List<Poi> pois = poiService.listNear(dto.x(), dto.y(), dto.dMax());
        List<PoiDTO> poisResponse = new ArrayList<>();
        pois.forEach(poi -> poisResponse.add(new PoiDTO(poi.getName(), poi.getX(), poi.getY())));
        return ResponseEntity.status(HttpStatus.OK).body(poisResponse);
    }
}
