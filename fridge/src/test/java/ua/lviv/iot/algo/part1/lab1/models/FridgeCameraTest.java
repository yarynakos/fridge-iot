package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FridgeCameraTest {

    @Test
    void getMaxUsableCapacity() {
        FridgeCamera fridgeCamera = new FridgeCamera("cold", "abc1", 50.0, false, "B", 4, "електрична", 6.0, 150.0);
        double result = fridgeCamera.getMaxUsableCapacity();
        Assertions.assertEquals(200.0, result);
    }
}
