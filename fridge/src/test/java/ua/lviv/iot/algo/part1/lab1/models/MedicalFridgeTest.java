package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalFridgeTest {
    private MedicalFridge medicalFridge;

    @BeforeEach
    public void setUp() {
        medicalFridge = new MedicalFridge("inetmed", "adc2", 25.0, true,
                "C", "скляні", "вертикальний", 1);
    }

    @Test
    void getMaxUsableCapacity() {
        double result = medicalFridge.getMaxUsableCapacity();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void getHeadersTest() {
        String expected = "brand, model, capacity, isDefrosting, instance, energyEfficiancyClasses, " +
                "typeOfDoors, typeOfFridge, numberOfDoors";
        Assertions.assertEquals(expected, medicalFridge.getHeaders());
    }

    @Test
    void toCSV() {
        String expected = "inetmed, adc2, 25.0, true, null, C, скляні,вертикальний, 1";
        Assertions.assertEquals(expected, medicalFridge.toCSV());

    }
}
