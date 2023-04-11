package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalFridgeTest {

    @Test
    void getMaxUsableCapacity() {
        MedicalFridge medicalFridge = new MedicalFridge("inetmed", "adc2", 25.0, true, "C", "скляні", "вертикальний", 1);
        double result = medicalFridge.getMaxUsableCapacity();
        Assertions.assertEquals(25.0, result);
    }
}
