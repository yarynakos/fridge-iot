package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FreezerTest {
    private Freezer freezer;

    @BeforeEach
    public void setUp() {
        freezer = new Freezer("Tefal", "acb1", 32.5, false,
                "C", -30.0, 3);
    }

    @Test
    void getMaxUsableCapacity() {
        double result = freezer.getMaxUsableCapacity();
        Assertions.assertEquals(97.5, result);
    }

    @Test
    void getHeadersTest() {
        String expected = "brand, model, capacity, isDefrosting, instance, energyEfficiancyClasses, " +
                "minTemperature, numberOfBoxes";
        Assertions.assertEquals(expected, freezer.getHeaders());
    }

    @Test
    void toCSV() {
        String expected = "Tefal, acb1, 32.5, false, null, C, -30.0, 3";
        Assertions.assertEquals(expected, freezer.toCSV());

    }
}
