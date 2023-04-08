package ua.lviv.iot.algo.part1.lab1;

import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FridgeManagerTest {
    private List<Fridge> fridges = new ArrayList<>(
            List.of(new FridgeCamera("cold", "abc1", 50.0, true, "B", 4, "електрична", 6.0, 150.0, 1.5),
                    new WineFridge("Tefcold", "abc4", 15.0, true, "A", 20, 1.0),
                    new Freezer("Tefal", "acb1", 32.5, true, "C", -30.0, 3),
                    new MedicalFridge("inetmed", "adc2", 25.0, true, "C", "скляні", "вертикальний", 1)));
    FridgeManager fridgeManager = new FridgeManager();

    @Before
    public void init() {
        fridgeManager.setFridges(fridges);
    }

    @Test
    public void findAllFridgesBiggerThanTest() {
        assertEquals(fridges, fridgeManager.findAllFridgesBiggerThan(10.0));
    }

    @Test
    public void findAllFridgesIsDefrosingTest() {
        assertEquals(fridges, fridgeManager.findAllFridgesIsDefrosing());
    }

    @Test
    public void addFridgeTest() {
        fridgeManager.addFridge(new Freezer("Samsung", "acb2", 29.7, true, "D", -10.0, 5));
        assertEquals(5, fridgeManager.getFridges().size());
    }
}
