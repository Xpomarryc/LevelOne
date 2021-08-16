package com.epam.model;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private int bombsCapacity;

    public MilitaryPlane(int id, int capacity, int liftingCapacity, int flightDistance, int fuelConsumption, String model, int bombsCapacity) {
        super(id, capacity, liftingCapacity, flightDistance, fuelConsumption, model);
        this.bombsCapacity = bombsCapacity;
    }

    public int getBombsCapacity() {
        return bombsCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "MilitaryPlane{" +
                "bombsCapacity=" + bombsCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return getBombsCapacity() == that.getBombsCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBombsCapacity());
    }
}
