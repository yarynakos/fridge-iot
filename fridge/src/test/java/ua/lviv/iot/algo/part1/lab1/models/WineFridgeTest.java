package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WineFridgeTest {
    private WineFridge wineFridge;

    @BeforeEach
    public void setUp() {
        wineFridge = new WineFridge("Tefcold", "abc4", 15.0, true, "A",
                20, 1.0);

    }

    @Test
    void getMaxUsableCapacity() {
        double result = wineFridge.getMaxUsableCapacity();
        Assertions.assertEquals(300.0, result);
    }

    @Test
    void getHeadersTest() {
        String expected = "brand, model, capacity, isDefrosting, instance, energyEfficiancyClasses, " +
                "maxNumbersOfBottle, maxCapacityOFBottle";
        Assertions.assertEquals(expected, wineFridge.getHeaders());
    }

    @Test
    void toCSV() {
        String expected = "Tefcold, abc4, 15.0, true, null, A, 20, 1.0";
        Assertions.assertEquals(expected, wineFridge.toCSV());

    }
}
