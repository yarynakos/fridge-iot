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

    public WineFridge(final String brand, final String model, final double capacity, final boolean isDefrosing,
                      final String energyEfficiancyClasses, final int maxNumbersOfBottle,
                      final double maxCapacityOFBottle) {
        super(brand, model, capacity, isDefrosing, energyEfficiancyClasses);
        this.maxNumbersOfBottle = maxNumbersOfBottle;
        this.maxCapacityOFBottle = maxCapacityOFBottle;
    }

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.maxNumbersOfBottle;
    }

    public String getHeaders() {
        return String.format("%s%s%s", super.getHeaders(), "maxNumbersOfBottle, ", "maxCapacityOFBottle");
    }

    public String toCSV() {
        return super.toCSV() + ", " + maxNumbersOfBottle + ", " + maxCapacityOFBottle;
    }
}
