package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FridgeCamera extends Fridge {
    private int numberOfEntries;
    private String typeOfTape;
    private double speedOfTape;
    private double maxWeight;
    public final double VOLUME_PER_KILOGRAM = 1.5;

    public FridgeCamera(String brand, String model, double capacity, boolean isDefrosing, String energyEfficiancyClasses,
                        int numberOfEntries, String typeOfTape, double speedOfTape, double maxWeight, double VOLUME_PER_KILOGRAM) {
        super(brand, model, capacity, isDefrosing, energyEfficiancyClasses);
        this.numberOfEntries = numberOfEntries;
        this.typeOfTape = typeOfTape;
        this.speedOfTape = speedOfTape;
        this.maxWeight = maxWeight;
    }

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.numberOfEntries;
    }
}
