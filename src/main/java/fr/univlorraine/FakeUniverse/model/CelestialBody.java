package fr.univlorraine.FakeUniverse.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CelestialBody {

    @Id
    private String name;

    private double radius;
    private double distanceFromOrigin;
    private double gravity;

    protected CelestialBody() {}

    public CelestialBody(String name, double radius, double distanceFromOrigin, double gravity) {
        this.name = name;
        this.radius = radius;
        this.distanceFromOrigin = distanceFromOrigin;
        this.gravity = gravity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(double distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

}
