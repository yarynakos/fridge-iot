package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.managers.FridgeManager;
import ua.lviv.iot.algo.part1.lab1.models.*;

import java.util.ArrayList;
import java.util.List;

class FridgeManagerTest {
    private final FridgeManager fridgeManager = new FridgeManager();
    private List<Fridge> fridges = new ArrayList<>(
            List.of(new FridgeCamera("cold", "abc1", 50.0, true, "B", 4, "електрична", 6.0, 150.0),
                    new WineFridge("Tefcold", "abc4", 15.0, true, "A", 20, 1.0),
                    new Freezer("Tefal", "acb1", 32.5, true, "C", -30.0, 3),
                    new MedicalFridge("inetmed", "adc2", 25.0, true, "C", "скляні", "вертикальний", 1)));

    @BeforeEach
    void setUp() {
        fridgeManager.setFridges(fridges);
    }

    @Test
    void addFridge() {
        fridgeManager.addFridge(new Freezer("Samsung", "acb2", 29.7, true, "D", -10.0, 5));
        Assertions.assertEquals(5, fridgeManager.getFridges().size());
    }

    @Test
    void findAllFridgesBiggerThan() {
        List<Fridge> result = fridgeManager.findAllFridgesBiggerThan(10);
        Assertions.assertEquals(fridges, result);
    }

    @Test
    void findAllFridgesIsDefrosing() {
        List<Fridge> result = fridgeManager.findAllFridgesIsDefrosing();
        Assertions.assertEquals(fridges, result);

    }
}
