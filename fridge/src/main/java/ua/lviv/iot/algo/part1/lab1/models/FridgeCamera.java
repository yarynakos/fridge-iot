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

    public FridgeCamera(final String brand, final String model, final double capacity, final boolean isDefrosing,
                        final String energyEfficiancyClasses, final int numberOfEntries, final String typeOfTape,
                        final double speedOfTape, final double maxWeight) {
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
    public String getHeaders(){
        return super.getHeaders() + "numberOfEntries, typeOfTape, speedOfTape, maxWeight, VOLUME_PER_KILOGRAM";
    }
    public  String toCSV(){
        return super.toCSV() + ", "+ numberOfEntries + ", " + typeOfTape + ", " + speedOfTape + ", " + maxWeight + ", "
                + VOLUME_PER_KILOGRAM;
    }
}
