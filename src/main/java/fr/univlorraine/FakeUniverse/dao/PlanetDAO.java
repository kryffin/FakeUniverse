package fr.univlorraine.FakeUniverse.dao;

import fr.univlorraine.FakeUniverse.model.Planet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PlanetDAO implements IPlanetDAO {

    private Map<String, Planet> bodies = new HashMap<>();

    @Override
    public List<Planet> findAll() {
        return new ArrayList<>(bodies.values());
    }

    @Override
    public Planet findByName(String name) {
        return bodies.get(name);
    }

    @Override
    public void save(Planet body) {
        if (!bodies.containsKey(body.getName()))
            bodies.put(body.getName(), body);
    }

    @Override
    public void remove(String name) {
        bodies.remove(name);
    }

}
