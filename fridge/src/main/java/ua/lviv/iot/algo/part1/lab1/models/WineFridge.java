package ua.lviv.iot.algo.part1.lab1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WineFridge extends Fridge {
    private int maxNumbersOfBottle;
    private double maxCapacityOFBottle;

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.maxNumbersOfBottle;
    }
}
