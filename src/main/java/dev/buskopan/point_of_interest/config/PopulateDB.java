package dev.buskopan.point_of_interest.config;

import dev.buskopan.point_of_interest.model.Poi;
import dev.buskopan.point_of_interest.repository.PoiRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PopulateDB implements CommandLineRunner {
    private final PoiRepository poiRepository;

    public PopulateDB(PoiRepository poiRepository) {
        this.poiRepository = poiRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            poiRepository.save(new Poi("Lanchonete", 27, 12));
            poiRepository.save(new Poi("Posto", 31, 18));
            poiRepository.save(new Poi("Joalheria", 15, 12));
            poiRepository.save(new Poi("Floricultura", 19, 21));
            poiRepository.save(new Poi("Pub", 12, 8));
            poiRepository.save(new Poi("Supermercado", 23, 6));
            poiRepository.save(new Poi("Churrascaria", 28, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
