package ua.lviv.iot.algo.part1.lab1.managers;

import ua.lviv.iot.algo.part1.lab1.models.Fridge;

import java.util.List;

public interface FridgeWriter {
    void writeToFile(List<Fridge> fridges);
}
