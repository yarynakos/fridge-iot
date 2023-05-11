package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WineFridgeTest {
    private WineFridge wineFridge;


    @Test
    void getMaxUsableCapacity() {
        double result = wineFridge.getMaxUsableCapacity();
        Assertions.assertEquals(300.0, result);
    }
}
