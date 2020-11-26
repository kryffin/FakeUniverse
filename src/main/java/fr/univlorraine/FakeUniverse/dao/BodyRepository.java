package fr.univlorraine.FakeUniverse.dao;

import fr.univlorraine.FakeUniverse.model.CelestialBody;
import org.springframework.data.repository.CrudRepository;

public interface BodyRepository extends CrudRepository<CelestialBody, String> {

    Iterable<CelestialBody> findByRadius(double radius);
    Iterable<CelestialBody> findByDistanceFromOrigin(double distanceFromOrigin);
    Iterable<CelestialBody> findByGravity(double gravity);

    CelestialBody findByName(String name);

    void deleteById(String name);

}
