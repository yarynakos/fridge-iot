package ua.lviv.iot.algo.part1.lab1;

import ua.lviv.iot.algo.part1.lab1.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        FridgeCamera fridge1 = new FridgeCamera(4, "електрична", 6.0, 150.0);
        FridgeCamera fridge2 = new FridgeCamera(3, "механічна", 7.0, 200.0);
        WineFridge fridge3 = new WineFridge(20, 1.0);
        WineFridge fridge4 = new WineFridge(15, 0.75);
        Freezer fridge5 = new Freezer(-30.0, 3);
        Freezer fridge6 = new Freezer(-10.0, 5);
        MedicalFridge fridge7 = new MedicalFridge("samsung","adc2",25.0,true,"C","скляні", "вертикальний", 1);
        MedicalFridge fridge8 = new MedicalFridge("глухі", "горизонтальний", 3);
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
