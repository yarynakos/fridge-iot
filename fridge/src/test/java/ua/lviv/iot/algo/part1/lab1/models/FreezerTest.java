package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreezerTest {

    @Test
    void getMaxUsableCapacity() {
        Freezer freezer = new Freezer("Tefal", "acb1", 32.5, false, "C", -30.0, 3);
        double result = freezer.getMaxUsableCapacity();
        Assertions.assertEquals(97.5, result);
    }
}
