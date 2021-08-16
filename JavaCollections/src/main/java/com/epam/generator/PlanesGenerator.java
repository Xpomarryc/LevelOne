package com.epam.generator;

import com.epam.model.MilitaryPlane;
import com.epam.model.PassengerPlane;
import com.epam.model.Plane;
import static com.epam.generator.GeneratorConstants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlanesGenerator {

    public List<Plane> generatePlanes(int count) {
        if (count <= 0) {
            System.err.println("Error: count is negative or zero!");
            return new ArrayList<>();
        }
        List<Plane> planes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Plane generatePlane = generatePlane(i + 1);
            planes.add(generatePlane);
        }
        return planes;
    }

    private Plane generatePlane(int count) {
        Random random = new Random();
        int planeNumber = random.nextInt(MAX_PLANE_NUMBER - MIN_PLANE_NUMBER + 1) + MIN_PLANE_NUMBER;
        int capacity = random.nextInt(MAX_CAPACITY - MIN_CAPACITY + 1) + MIN_CAPACITY;
        int liftingCapacity = random.nextInt(MAX_LIFTING_CAPACITY - MIN_LIFTING_CAPACITY + 1) + MIN_LIFTING_CAPACITY;
        int flightDistance = random.nextInt(MAX_FLIGHT_DISTANCE - MIN_FLIGHT_DISTANCE + 1) + MIN_FLIGHT_DISTANCE;
        int fuelConsumption = random.nextInt(MAX_FUEL_CONSUMPTION - MIN_FUEL_CONSUMPTION + 1) + MIN_FUEL_CONSUMPTION;
        if (planeNumber == 1) {
            int passengerSeat = random.nextInt(MAX_PASSENGER_SEAT - MIN_PASSENGER_SEAT + 1) + MIN_PASSENGER_SEAT;
            return new PassengerPlane(count, capacity, liftingCapacity, flightDistance, fuelConsumption, "PassengersPlane" + count, passengerSeat);
        } else {
            int bombsCapacity = random.nextInt(MAX_BOMBS_CAPACITY - MIN_BOMBS_CAPACITY + 1) + MIN_BOMBS_CAPACITY;
            return new MilitaryPlane(count, capacity, liftingCapacity, flightDistance, fuelConsumption, "MilitaryPlane" + count, bombsCapacity);
        }
    }
}
