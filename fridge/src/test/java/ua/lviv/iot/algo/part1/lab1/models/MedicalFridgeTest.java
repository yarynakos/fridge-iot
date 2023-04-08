package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MedicalFridgeTest {
    @Test
    public void getMaxUsableCapacityTest() {
        MedicalFridge fridge = new MedicalFridge("inetmed", "adc2", 25.0, true, "C", "скляні", "вертикальний", 1);
        assertEquals(25.0, fridge.getMaxUsableCapacity());
    }

}