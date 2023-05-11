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