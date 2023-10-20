package hu.elte.progtech.fourth_class;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Vehicle> vehicles;

    public DataStore() {
        this.vehicles = new ArrayList<>();
    }

    public void readFileWithBufferedReader(String fileName) throws IOException {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Proper file name needed");
        }
        File inputFile = new File(fileName);
        if (!inputFile.exists()) {
            throw new InvalidInputException();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        //Reading line by line
        String line;
        line = bufferedReader.readLine();
        if (line == null) {
            throw new InvalidInputException();
        }
        int numberOfVehicles = Integer.parseInt(line);
        for (int i = 0; i < numberOfVehicles; i++) {
            Vehicle vehicle;
            line = bufferedReader.readLine();
            String[] splitLine = line.split(" ");
            switch (splitLine[0]) {
                case "S" -> vehicle = new Car(splitLine[1]);
                case "B" -> vehicle = new Bus(splitLine[1]);
                case "T" -> vehicle = new Truck(splitLine[1]);
                default -> throw new InvalidInputException();
            }
            int numberOfFueling = Integer.parseInt(splitLine[2]);
            for (int j = 0; j < numberOfFueling; j++) {
                vehicle.addFueling(Integer.parseInt(splitLine[j + 3]));
            }
            vehicles.add(vehicle);
        }
        System.out.println(vehicles);
        bufferedReader.close();
    }

    public void readFileWithNewIO(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        lines = Files.readAllLines(filePath);
    }

    public void report() {
        System.out.println("Vehicles in the database:");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        System.out.println("Mean refuels: ");
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getLicensePlate() + ": " + vehicle.getAvgFueling());
        }
        String[] categories = {"S", "B", "T"};
        for (String cat : categories) {
            System.out.println("Refuels in category " + cat + ":");
            ArrayList<Vehicle> catVehicles = collectCategory(cat);
            System.out.println("Most fuel refueled: " + catVehicles.stream().max((vh1, vh2) -> vh1.getSumFueling().compareTo(vh2.getSumFueling())).get());
            System.out.println("Least fuel refueled: " + catVehicles.stream().min((vh1, vh2) -> vh1.getSumFueling().compareTo(vh2.getSumFueling())).get());
            System.out.println("Most times refueled: " + catVehicles.stream().max((vh1, vh2) -> vh1.getSumFueling().compareTo(vh2.getSumFueling())).get());
            System.out.println("Least times refueled: " + catVehicles.stream().min((vh1, vh2) -> vh1.getSumFueling().compareTo(vh2.getSumFueling())).get());
        }
    }

    public ArrayList<Vehicle> collectCategory(String category) {
        ArrayList<Vehicle> catVehicles = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getType().equals(category)) {
                catVehicles.add(v);
            }
        }
        return catVehicles;
    }

    public void clear() {
        vehicles.clear();
    }

}
