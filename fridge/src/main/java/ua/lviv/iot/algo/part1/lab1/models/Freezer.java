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

    public Freezer(final String brand, final String model, final double capacity, final boolean isDefrosing,
                   final String energyEfficiancyClasses, final double minTemperature, final int numberOfBoxes) {
        super(brand, model, capacity, isDefrosing, energyEfficiancyClasses);
        this.minTemperature = minTemperature;
        this.numberOfBoxes = numberOfBoxes;
    }

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.numberOfBoxes;
    }

    public String getHeaders() {
        return String.format("%s%s%s", super.getHeaders(), "minTemperature, ", "numberOfBoxes");
    }

    public String toCSV() {
        return super.toCSV() + ", " + minTemperature + ", " + numberOfBoxes;
    }
}
