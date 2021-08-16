package com.epam.model;

import java.util.Objects;

abstract public class Plane {
    private int id;
    private int capacity;
    private int liftingCapacity;
    private int flightDistance;
    private int fuelConsumption;
    private String model;

    public Plane(int id, int capacity, int liftingCapacity, int flightDistance, int fuelConsumption, String model) {
        this.id = id;
        this.capacity = capacity;
        this.liftingCapacity = liftingCapacity;
        this.flightDistance = flightDistance;
        this.fuelConsumption = fuelConsumption;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", liftingCapacity=" + liftingCapacity +
                ", flightDistance=" + flightDistance +
                ", fuelConsumption=" + fuelConsumption +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return getId() == plane.getId() && getCapacity() == plane.getCapacity() && getLiftingCapacity() == plane.getLiftingCapacity() && getFlightDistance() == plane.getFlightDistance() && getFuelConsumption() == plane.getFuelConsumption() && Objects.equals(getModel(), plane.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCapacity(), getLiftingCapacity(), getFlightDistance(), getFuelConsumption(), getModel());
    }
}


