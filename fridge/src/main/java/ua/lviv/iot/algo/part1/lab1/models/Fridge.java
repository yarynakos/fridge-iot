package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public abstract class Fridge {
    private String brand;
    private String model;
    private double capacity;
    private boolean isDefrosting;
    private static Fridge instance;
    private String energyEfficiancyClasses;

    public void turnOnDefrosting() {
        this.isDefrosting = true;
    }

    public void turnOffDefrosting() {
        this.isDefrosting = false;
    }

    public void deleteModelInfo() {
        this.model = null;
    }

    public static Fridge getInstance() {
        return instance;
    }

    public abstract double getMaxUsableCapacity();
}
