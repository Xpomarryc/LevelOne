package com.epam.model;

import java.util.Objects;

public class PassengerPlane extends Plane {

    private int passengerSeats;

    public PassengerPlane(int id, int capacity, int liftingCapacity, int flightDistance, int fuelConsumption, String model, int passengerSeats) {
        super(id, capacity, liftingCapacity, flightDistance, fuelConsumption, model);
        this.passengerSeats = passengerSeats;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    @Override
    public String toString() {
        return super.toString() + "PassengerPlane{" +
                "passengerSeats=" + passengerSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerPlane that = (PassengerPlane) o;
        return getPassengerSeats() == that.getPassengerSeats();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassengerSeats());
    }
}
