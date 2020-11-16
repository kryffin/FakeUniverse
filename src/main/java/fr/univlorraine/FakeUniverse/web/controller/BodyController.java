package fr.univlorraine.FakeUniverse.web.controller;

import fr.univlorraine.FakeUniverse.dao.IBodyDAO;
import fr.univlorraine.FakeUniverse.model.CelestialBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BodyController {

    @Autowired
    private IBodyDAO dao;

    @GetMapping(value="/Bodies")
    public List<CelestialBody> getBodies() {
        return dao.findAll();
    }

    @GetMapping(value="/Bodies/{name}")
    public CelestialBody getBody(@PathVariable String name) {
        return dao.findByName(name);
    }

    @PostMapping(value = "Bodies")
    public void addBody(@RequestBody CelestialBody body) {
        dao.save(body);
    }

    @DeleteMapping(value="/Bodies/{name}")
    public void removePlanet(@PathVariable String name) {
        dao.remove(name);
    }

}
