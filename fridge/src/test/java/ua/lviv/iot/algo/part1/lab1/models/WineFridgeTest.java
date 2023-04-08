package ua.lviv.iot.algo.part1.lab1.models;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WineFridgeTest {
    @Test
    public void getMaxUsableCapacityTest(){
        WineFridge wineFridge = new WineFridge("Tefcold", "abc4", 15.0, true, "A", 20, 1.0);
        assertEquals(300.0, wineFridge.getMaxUsableCapacity());
    }

}