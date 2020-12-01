package fr.univlorraine.FakeUniverse.web.controller;

import fr.univlorraine.FakeUniverse.dao.BodyRepository;
import fr.univlorraine.FakeUniverse.model.CelestialBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@EnableDiscoveryClient
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BodyController {

    @Value("${me}")
    private String me;

    @Autowired
    private BodyRepository dao;

    @GetMapping(value="/Bodies")
    public Iterable<CelestialBody> getBodies() {
        return dao.findAll();
    }

    @GetMapping(value="/Bodies/{name}")
    public CelestialBody getBody(@PathVariable String name) {
        return dao.findByName(name);
    }

    @PostMapping(value = "/Bodies")
    public void addBody(@RequestBody CelestialBody body) {
        dao.save(body);
    }

    @DeleteMapping(value="/Bodies/{name}")
    public void removePlanet(@PathVariable String name) {
        dao.deleteById(name);
    }

    @GetMapping(value = "/Quicest")
    public String getName() {
        return me;
    }

}
