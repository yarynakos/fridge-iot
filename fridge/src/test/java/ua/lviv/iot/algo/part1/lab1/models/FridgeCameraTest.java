package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeCameraTest {
    private FridgeCamera fridgeCamera;

    @BeforeEach
    public void setUp() {
        fridgeCamera = new FridgeCamera("cold", "abc1", 50.0, false, "B",
                4, "електрична", 6.0, 150.0);
    }


    @Test
    void getMaxUsableCapacity() {
        double result = fridgeCamera.getMaxUsableCapacity();
        Assertions.assertEquals(200.0, result);
    }

    @Test
    void getHeadersTest() {
        String expected = "brand, model, capacity, isDefrosting, instance, energyEfficiancyClasses, " +
                "numberOfEntries, typeOfTape, speedOfTape, maxWeight, VOLUME_PER_KILOGRAM";
        Assertions.assertEquals(expected, fridgeCamera.getHeaders());
    }

    @Test
    void toCSV() {
        String expected = "cold, abc1, 50.0, false, null, B, 4, електрична, 6.0, 150.0, 1.5";
        Assertions.assertEquals(expected, fridgeCamera.toCSV());

    }
}
