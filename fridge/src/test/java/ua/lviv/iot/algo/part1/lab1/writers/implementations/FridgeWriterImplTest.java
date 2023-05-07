package ua.lviv.iot.algo.part1.lab1.writers.implementations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FridgeWriterImplTest {
    private List<Fridge> fridges;
    private FridgeWriterImpl fridgeWriter;

    @BeforeEach
    void setUp() {
        fridges = new ArrayList<>();
        fridgeWriter = new FridgeWriterImpl();
        fridges.add(new FridgeCamera("cold", "abc1", 50.0, false, "B", 4, "електрична", 6.0, 150.0));
        fridges.add(new FridgeCamera("frozen", "abc6", 45.0, true, "D", 3, "механічна", 7.0, 200.0));
        fridges.add(new WineFridge("Tefcold", "abc4", 15.0, true, "A", 20, 1.0));
        fridges.add(new WineFridge("Klarstein", "adc", 20.0, true, "B", 15, 0.75));
        fridges.add( new Freezer("Tefal", "acb1", 32.5, false, "C", -30.0, 3));
        fridges.add(new Freezer("Samsung", "acb2", 29.7, true, "D", -10.0, 5));
        fridges.add( new MedicalFridge("inetmed", "adc2", 25.0, true, "C", "скляні", "вертикальний", 1));
        fridges.add(new MedicalFridge("Meling", "adc3", 40.0, false, "A", "глухі", "горизонтальний", 3));
    }

    @Test
    void writeToFile() throws IOException {
        String readerExPath = "src\\test\\java\\ua\\lviv\\iot\\algo\\part1\\lab1\\resources\\expected.csv";
        String readerResPath = "src\\main\\java\\ua\\lviv\\iot\\algo\\part1\\lab1\\resources\\result.csv";
        fridgeWriter.writeToFile(this.fridges);
        try (BufferedReader readerEx = new BufferedReader(new FileReader(readerExPath));
            BufferedReader readerRes = new BufferedReader(new FileReader(readerResPath))) {
            assertNotEquals(readerRes.readLine(), null);
            assertEquals(readerEx.readLine(), readerRes.readLine());
        }
    }
}