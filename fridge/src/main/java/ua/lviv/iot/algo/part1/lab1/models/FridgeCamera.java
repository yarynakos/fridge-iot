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
public class FridgeCamera extends Fridge {
    private int numberOfEntries;
    private String typeOfTape;
    private double speedOfTape;
    private double maxWeight;
    public final double VOLUME_PER_KILOGRAM = 1.5;

    @Override
    public double getMaxUsableCapacity() {
        return this.getCapacity() * this.numberOfEntries;
    }
}
