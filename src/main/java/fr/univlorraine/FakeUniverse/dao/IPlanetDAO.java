package fr.univlorraine.FakeUniverse.dao;

import fr.univlorraine.FakeUniverse.model.Planet;

import java.util.List;

public interface IPlanetDAO {

    List<Planet> findAll();
    Planet findByName(String name);
    void save(Planet body);
    void remove(String name);

}
