package ua.lviv.iot.algo.part1.lab1.writers.implementations;

import ua.lviv.iot.algo.part1.lab1.writers.FridgeWriter;
import ua.lviv.iot.algo.part1.lab1.models.Fridge;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FridgeWriterImpl implements FridgeWriter {
    private static final String FILE_NAME = "\"src\\main\\java\\ua\\lviv\\iot\\algo\\part1\\lab1\\resources\\fridges.csv\"";

    @Override
    public void writeToFile(List<Fridge> fridges) throws IOException {
        if (fridges.isEmpty()) {
            try (FileWriter writer = new FileWriter(FILE_NAME)) {
                List<String> listOfClassNames = new ArrayList<>();
                listOfClassNames.add(fridges.get(0).getClass().getSimpleName());
                writer.write(fridges.get(0).getHeaders());
                writer.write("\n");
                fridges.stream()
                        .forEach(fridge -> {
                            try {
                                if (isCurrenObjectClassTheSameAsPrevious(listOfClassNames, fridge)) {
                                    listOfClassNames.add(fridge.getClass().getSimpleName());
                                    writer.write(fridge.getHeaders());
                                    writer.write("\n");
                                }
                                writer.write(fridge.toCSV());
                                writer.write("\n");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        });
            }
        }
    }

    private boolean isCurrenObjectClassTheSameAsPrevious(List<String> listOfClassNames, Fridge fridge) {
        return !fridge.getClass().getSimpleName().equals(listOfClassNames.get(listOfClassNames.size() - 1));
    }
}