package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WineFridge extends Fridge {
    private int maxNumbersOfBottle;
    private double maxCapacityOFBottle;

    public WineFridge(String brand, String model, double capacity, boolean isDefrosing, String energyEfficiancyClasses,
                      int maxNumbersOfBottle, double maxCapacityOFBottle) {
        super(brand, model, capacity, isDefrosing, energyEfficiancyClasses);
        this.maxNumbersOfBottle = maxNumbersOfBottle;
        this.maxCapacityOFBottle = maxCapacityOFBottle;
    }

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.maxNumbersOfBottle;
    }
}
