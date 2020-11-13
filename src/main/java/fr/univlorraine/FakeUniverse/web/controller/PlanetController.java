package fr.univlorraine.FakeUniverse.web.controller;

import fr.univlorraine.FakeUniverse.dao.IPlanetDAO;
import fr.univlorraine.FakeUniverse.model.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanetController {

    @Autowired
    private IPlanetDAO dao;

    @GetMapping(value="/Bodies")
    public List<Planet> getBodies() {
        return dao.findAll();
    }

    @GetMapping(value="/Bodies/{name}")
    public Planet getBody(@PathVariable String name) {
        return dao.findByName(name);
    }

    @PostMapping(value="Bodies")
    public void addBody(@RequestBody Planet body) {
        dao.save(body);
    }

}
