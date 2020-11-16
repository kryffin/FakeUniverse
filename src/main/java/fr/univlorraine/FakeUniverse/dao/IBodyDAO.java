package fr.univlorraine.FakeUniverse.dao;

import fr.univlorraine.FakeUniverse.model.CelestialBody;

import java.util.List;

public interface IBodyDAO {

    List<CelestialBody> findAll();
    CelestialBody findByName(String name);
    void save(CelestialBody body);
    void remove(String name);

}
