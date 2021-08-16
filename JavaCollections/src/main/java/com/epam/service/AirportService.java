package com.epam.service;

import com.epam.model.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirportService {

    public int calculateCapacitySum(List<Plane> planes) {
        int sum = 0;
        for (Plane plane : planes) {
            sum += plane.getCapacity();
        }
        return sum;
    }

    public int calculateLiftingCapacitySum(List<Plane> planes) {
        int sum = 0;
        for (Plane plane : planes) {
            sum += plane.getLiftingCapacity();
        }
        return sum;
    }

    public List<Plane> sortByFlightDistance(List<Plane> planes) {
        List<Plane> sortedPlanes = new ArrayList<>(planes);
        sortedPlanes.sort(Comparator.comparingInt(Plane::getFlightDistance));
        return sortedPlanes;
    }

    public List<Plane> findPlanesFuelConsumptionByRange(List<Plane> planes, int min, int max) {
        if (min > max) {
            System.err.println("Error: min > max");
            return new ArrayList<>();
        }
        List<Plane> foundPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getFuelConsumption() >= min && plane.getFuelConsumption() <= max) {
                foundPlanes.add(plane);
            }
        }
        return foundPlanes;
    }
}
