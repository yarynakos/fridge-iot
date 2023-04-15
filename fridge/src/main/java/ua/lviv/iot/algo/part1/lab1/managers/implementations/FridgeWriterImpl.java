package ua.lviv.iot.algo.part1.lab1.managers.implementations;

import ua.lviv.iot.algo.part1.lab1.managers.FridgeWriter;
import ua.lviv.iot.algo.part1.lab1.models.Fridge;

import java.io.*;
import java.util.List;

public class FridgeWriterImpl implements FridgeWriter {
    @Override
    public void writeToFile(List<Fridge> fridges) {
        try (FileWriter writer = new FileWriter("fridges.csv")) {
            String className = new String("");
            fridges.stream()
                    .forEach(fridge -> {
                        try {
                            if (!fridge.getClass().getSimpleName().equals(className)) {
                                className = fridge.getClass().getSimpleName();
                                writer.write(fridge.getHeaders());
                                writer.write("\n");
                            }
                            writer.write(fridge.toCSV());
                            writer.write("\n");
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    });
        } catch (Exception e) {
            new File("fridges.csv");
        }
    }
}
