package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
public class MedicalFridge extends Fridge {
    private String typeOfDoors;
    private String typeOfFridge;
    private int numberOfDoors;

    public MedicalFridge(String brand, String model, double capasity, boolean isDefrosing, String energyEfficiancyClasses,
                         String typeOfDoors, String typeOfFridge, int numberOfDoors) {
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
