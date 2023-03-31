package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Freezer extends Fridge {
    private double minTemperature;
    private int numberOfBoxes;

    public Freezer(String brand, String model, double capacity, boolean isDefrosing, String energyEfficiancyClasses,
                   double minTemperature, int numberOfBoxes) {
        super(brand, model, capacity, isDefrosing, energyEfficiancyClasses);
        this.minTemperature = minTemperature;
        this.numberOfBoxes = numberOfBoxes;
    }

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.numberOfBoxes;
    }
}
