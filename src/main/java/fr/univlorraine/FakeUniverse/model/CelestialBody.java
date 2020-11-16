package fr.univlorraine.FakeUniverse.model;

public class CelestialBody {

    private String name;
    private double radius;
    private double distanceFromOrigin;
    private double gravity;

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

    public double getDistanceFromSun() {
        return distanceFromOrigin;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromOrigin = distanceFromSun;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

}
