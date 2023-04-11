package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WineFridgeTest {

    @Test
    void getMaxUsableCapacity() {
        WineFridge wineFridge = new WineFridge("Tefcold", "abc4", 15.0, true, "A", 20, 1.0);
        double result = wineFridge.getMaxUsableCapacity();
        Assertions.assertEquals(300.0, result);
    }
}
