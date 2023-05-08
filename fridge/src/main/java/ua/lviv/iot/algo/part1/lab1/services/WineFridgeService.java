package ua.lviv.iot.algo.part1.lab1.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.models.WineFridge;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Service
@Scope("singleton")
public class WineFridgeService {
    private final Map<Integer, WineFridge> fridgeMap = new HashMap<>();

    {
        fridgeMap.put(1, new WineFridge("sas", "sasa", 4.5, true, "ada", 45, 4, 1));
    }

    private Integer nextAvailableId = 1;

    public Collection<WineFridge> getAllFridges() {
        return this.fridgeMap.values();
    }

    public WineFridge getFridgeById(Integer id) {
        return this.fridgeMap.get(id);
    }

    public WineFridge addFridge(WineFridge entity) {
        this.fridgeMap.put(this.nextAvailableId++, entity);
        this.fridgeMap.put(entity.getId(), entity);
        return entity;
    }

    public WineFridge editFridge(Integer id, WineFridge entity) {
        WineFridge newEntity = this.fridgeMap.get(id);
        newEntity.setBrand(entity.getBrand());
        newEntity.setModel(entity.getModel());
        newEntity.setCapacity(entity.getCapacity());
        newEntity.setDefrosting(entity.isDefrosting());
        newEntity.setEnergyEfficiancyClasses(entity.getEnergyEfficiancyClasses());
        newEntity.setMaxNumbersOfBottle(entity.getMaxNumbersOfBottle());
        newEntity.setMaxCapacityOFBottle(entity.getMaxCapacityOFBottle());
        return this.fridgeMap.replace(id, newEntity);
    }

    public void deleteFridge(Integer id) {
        this.fridgeMap.remove(id);
    }
}
