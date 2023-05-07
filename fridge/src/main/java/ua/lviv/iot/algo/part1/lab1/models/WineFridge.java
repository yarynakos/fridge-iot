package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ToString
public class WineFridge extends Fridge {
    private int maxNumbersOfBottle;
    private double maxCapacityOFBottle;
    private Integer id;

    public WineFridge(Integer id, String brand, String model, double capacity, boolean isDefrosing,
                      String energyEfficiancyClasses, int maxNumbersOfBottle,
                      double maxCapacityOFBottle) {
        super(brand, model, capacity, isDefrosing, energyEfficiancyClasses);
        this.maxNumbersOfBottle = maxNumbersOfBottle;
        this.maxCapacityOFBottle = maxCapacityOFBottle;
        this.id = 1;
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
