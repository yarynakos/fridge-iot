package ua.lviv.iot.algo.part1.lab1.models;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FridgeCameraTest {
    @Test
    public void getMaxUsableCapacityTest(){
        FridgeCamera fridgeCamera = new FridgeCamera("cold", "abc1", 50.0, false, "B",  4, "електрична", 6.0, 150.0, 1.5);
        assertEquals(200.0, fridgeCamera.getMaxUsableCapacity());
    }


}