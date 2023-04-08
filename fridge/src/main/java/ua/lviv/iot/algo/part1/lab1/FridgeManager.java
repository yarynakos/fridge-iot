package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import ua.lviv.iot.algo.part1.lab1.models.Freezer;
import ua.lviv.iot.algo.part1.lab1.models.Fridge;
import ua.lviv.iot.algo.part1.lab1.models.FridgeCamera;
import ua.lviv.iot.algo.part1.lab1.models.MedicalFridge;
import ua.lviv.iot.algo.part1.lab1.models.WineFridge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class FridgeManager {
    private List<Fridge> fridges = new ArrayList<>();

    public void addFridge(final Fridge fridge) {
        fridges.add(fridge);
    }

    public List<Fridge> findAllFridgesBiggerThan(double capacity) {
        return this.fridges.stream()
                .filter((element) -> element.getCapacity() >= capacity)
                .collect(Collectors.toList());
    }

    public List<Fridge> findAllFridgesIsDefrosing() {
        return this.fridges.stream()
                .filter((element) -> element.isDefrosting())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FridgeManager fridgeManager = new FridgeManager();
        FridgeCamera fridge1 = new FridgeCamera("cold", "abc1", 50.0, false, "B", 4, "електрична", 6.0, 150.0, 1.5);
        FridgeCamera fridge2 = new FridgeCamera("frozen", "abc6", 45.0, true, "D", 3, "механічна", 7.0, 200.0, 1.5);
        WineFridge fridge3 = new WineFridge("Tefcold", "abc4", 15.0, true, "A", 20, 1.0);
        WineFridge fridge4 = new WineFridge("Klarstein", "adc", 20.0, true, "B", 15, 0.75);
        Freezer fridge5 = new Freezer("Tefal", "acb1", 32.5, false, "C", -30.0, 3);
        Freezer fridge6 = new Freezer("Samsung", "acb2", 29.7, true, "D", -10.0, 5);
        MedicalFridge fridge7 = new MedicalFridge("inetmed", "adc2", 25.0, true, "C", "скляні", "вертикальний", 1);
        MedicalFridge fridge8 = new MedicalFridge("Meling", "adc3", 40.0, false, "A", "глухі", "горизонтальний", 3);
        fridgeManager.addFridge(fridge1);
        fridgeManager.addFridge(fridge2);
        fridgeManager.addFridge(fridge3);
        fridgeManager.addFridge(fridge4);
        fridgeManager.addFridge(fridge5);
        fridgeManager.addFridge(fridge6);
        fridgeManager.addFridge(fridge7);
        fridgeManager.addFridge(fridge8);

        for (Fridge fridge : fridgeManager.fridges) {
            System.out.println(fridge);
        }

        List<Fridge> filteredFridges = fridgeManager.findAllFridgesBiggerThan(30.0);
        List<Fridge> filteredFridges2 = fridgeManager.findAllFridgesIsDefrosing();

        for (Fridge fridge : filteredFridges) {
            System.out.println(fridge);
        }

        for (Fridge fridge : filteredFridges2) {
            System.out.println(fridge);
        }
    }
}
