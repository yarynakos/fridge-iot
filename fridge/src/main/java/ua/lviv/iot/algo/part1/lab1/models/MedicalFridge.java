package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MedicalFridge extends Fridge {
    private String typeOfDoors;
    private String typeOfFridge;
    private int numberOfDoors;

    public MedicalFridge(final String brand, final String model, final double capasity, final boolean isDefrosing,
                         final String energyEfficiancyClasses, final String typeOfDoors, final String typeOfFridge,
                         final int numberOfDoors) {
        super(brand, model, capasity, isDefrosing, energyEfficiancyClasses);
        this.typeOfDoors = typeOfDoors;
        this.typeOfFridge = typeOfFridge;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.numberOfDoors;
    }
}
