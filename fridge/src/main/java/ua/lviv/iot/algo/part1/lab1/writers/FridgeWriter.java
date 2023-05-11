package ua.lviv.iot.algo.part1.lab1.writers;

import ua.lviv.iot.algo.part1.lab1.models.Fridge;

import java.io.IOException;
import java.util.List;

public interface FridgeWriter {
    void writeToFile(List<Fridge> fridges) throws IOException;
}
