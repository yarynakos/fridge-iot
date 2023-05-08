package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString

public class WineFridge extends Fridge {
    private int maxNumbersOfBottle;
    private double maxCapacityOFBottle;
    private Integer id;

    public WineFridge(String brand, String model, double capacity, boolean isDefrosting
            , String energyEfficiancyClasses, int maxNumbersOfBottle, double maxCapacityOFBottle, Integer id) {
        super(brand, model, capacity, isDefrosting, energyEfficiancyClasses);
        this.id = 0;
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
