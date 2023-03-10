package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

enum EfficiancyClasses {
    A, B, C, D, E, F, G
}

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fridge {
    private String brand;
    private String model;
    private double capacity;
    private boolean isDefrosting;
    private static Fridge instance = new Fridge();
    private EfficiancyClasses energyEfficiancyClasses;

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

    public static void main(String[] args) {
        Fridge[] fridges = new Fridge[4];
        fridges[0] = new Fridge();
        fridges[1] = new Fridge("Sony", "XP200", 100.0, true, EfficiancyClasses.A);
        fridges[2] = Fridge.getInstance();
        fridges[3] = Fridge.getInstance();
        for (int i = 0; i < fridges.length; i++) {
            System.out.println(fridges[i].model);
        }
    }
}
