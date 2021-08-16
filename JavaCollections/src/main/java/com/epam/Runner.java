package com.epam;

import com.epam.generator.PlanesGenerator;
import com.epam.service.AirportService;
import com.epam.model.Plane;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        PlanesGenerator generator = new PlanesGenerator();
        List<Plane> planes = generator.generatePlanes(5);
        AirportService service = new AirportService();
        System.out.println("Generated Planes:");
        for (Plane plane : planes) {
            System.out.println(plane.toString());
        }

        System.out.println("Capacity sum:" + service.calculateCapacitySum(planes));
        System.out.println("Lifting capacity sum:" + service.calculateLiftingCapacitySum(planes));

        List<Plane> sortedPlanes = service.sortByFlightDistance(planes);
        System.out.println("Planes sorted by flight distance:");
        for (Plane plane : sortedPlanes) {
            System.out.println(plane.toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel consumption min:");
        InputCheck.checkInput(scanner);
        int min = scanner.nextInt();
        System.out.println("Enter fuel consumption max:");
        InputCheck.checkInput(scanner);
        int max = scanner.nextInt();
        List<Plane> foundPlanes = service.findPlanesFuelConsumptionByRange(planes, min, max);
        for (Plane plane : foundPlanes) {
            System.out.println(plane.toString());
        }
        if (foundPlanes.isEmpty()) {
            System.err.println("There are no planes within such range!");
        }
    }
}
