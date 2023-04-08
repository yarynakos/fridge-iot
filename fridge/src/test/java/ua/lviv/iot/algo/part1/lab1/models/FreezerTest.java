package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FreezerTest {
    @Test
    public void getMaxUsableCapacityTest(){
        Freezer freezer = new Freezer("Samsung", "acb2", 29.7, true, "D", -10.0, 5);
        assertEquals(148.5, freezer.getMaxUsableCapacity());
    }

}