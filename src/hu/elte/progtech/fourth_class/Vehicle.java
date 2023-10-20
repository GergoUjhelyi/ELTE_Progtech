package hu.elte.progtech.fourth_class;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected String licensePlate;

    protected String type;

    protected List<Integer> fueling;

    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.fueling = new ArrayList<>();
    }

    public void addFueling(int fuel) {
        if (fuel >= 0) {
            fueling.add(fuel);
        }
    }

    public int getNumberOfFueling() {
        return this.fueling.size();
    }

    public double getAvgFueling() {
        return this.fueling.stream().mapToInt((a) -> a).average().orElse(0);
    }

    public Integer getSumFueling() {
        return this.fueling.stream().mapToInt((a) -> a).sum();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", type='" + type + '\'' +
                ", fueling=" + fueling +
                '}';
    }
}
