package ua.lviv.iot.algo.part1.lab1.writers.implementations;

import ua.lviv.iot.algo.part1.lab1.writers.FridgeWriter;
import ua.lviv.iot.algo.part1.lab1.models.Fridge;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FridgeWriterImpl implements FridgeWriter {
    @Override
    public void writeToFile(List<Fridge> fridges) {
        if (fridges.size() != 0){
            try (FileWriter writer = new FileWriter("src\\main\\java\\ua\\lviv\\iot\\algo\\part1\\lab1\\resources\\fridges.csv")) {
                List<String> listOfClassNames = new ArrayList<>();
                listOfClassNames.add(fridges.get(0).getClass().getSimpleName());
                writer.write(fridges.get(0).getHeaders());
                writer.write("\n");
                fridges.stream()
                        .forEach(fridge -> {
                            try {
                                if (!fridge.getClass().getSimpleName().equals(listOfClassNames.get(listOfClassNames.size() - 1))) {
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
            } catch (Exception e) {
                new File("src\\main\\java\\ua\\lviv\\iot\\algo\\part1\\lab1\\resources\\fridges.csv");
            }
        }
    }
}
