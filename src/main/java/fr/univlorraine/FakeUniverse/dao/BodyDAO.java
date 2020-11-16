package fr.univlorraine.FakeUniverse.dao;

import fr.univlorraine.FakeUniverse.model.CelestialBody;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BodyDAO implements IBodyDAO {

    private Map<String, CelestialBody> bodies = new HashMap<>();

    @Override
    public List<CelestialBody> findAll() {
        return new ArrayList<>(bodies.values());
    }

    @Override
    public CelestialBody findByName(String name) {
        return bodies.get(name);
    }

    @Override
    public void save(CelestialBody body) {
        if (!bodies.containsKey(body.getName()))
            bodies.put(body.getName(), body);
    }

    @Override
    public void remove(String name) {
        bodies.remove(name);
    }

}
