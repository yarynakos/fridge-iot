package ua.lviv.iot.algo.part1.lab1.managers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.lviv.iot.algo.part1.lab1.models.Fridge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FridgeManager {
    private List<Fridge> fridges = new ArrayList<>();

    public void addFridge(final Fridge fridge) {
        fridges.add(fridge);
    }

    public List<Fridge> findAllFridgesBiggerThan(double capacity) {
        return this.fridges.stream()
                .filter((element) -> element.getCapacity() >= capacity)
                .collect(Collectors.toList());
    }

    public List<Fridge> findAllFridgesIsDefrosing() {
        return this.fridges.stream()
                .filter((element) -> element.isDefrosting())
                .collect(Collectors.toList());
    }
}
