package ua.lviv.iot.algo.part1.lab1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Freezer extends Fridge {
    private double minTemperature;
    private int numberOfBoxes;
    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.numberOfBoxes;
    }
}
