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
    private final Map<Integer, WineFridge> map = new HashMap<>();
    private Integer nextAvailable = 1;

    public Collection<WineFridge> getAllFridges() {
        return this.map.values();
    }

    public WineFridge getFridgeById(Integer id) {
        return this.map.get(id);
    }

    public WineFridge addFridge(WineFridge entity) {
        entity.setId(this.nextAvailable);
        this.map.put(this.nextAvailable, entity);
        this.nextAvailable++;
        return this.map.get(this.nextAvailable - 1);
    }

    public WineFridge editFridge(Integer id, WineFridge entity) {
        WineFridge newEntity = this.map.get(id);
        newEntity.setBrand(entity.getBrand());
        newEntity.setModel(entity.getModel());
        newEntity.setCapacity(entity.getCapacity());
        newEntity.setDefrosting(entity.isDefrosting());
        newEntity.setEnergyEfficiancyClasses(entity.getEnergyEfficiancyClasses());
        newEntity.setMaxNumbersOfBottle(entity.getMaxNumbersOfBottle());
        newEntity.setMaxCapacityOFBottle(entity.getMaxCapacityOFBottle());
        return this.map.replace(id, newEntity);
    }
    public void deleteFridge(Integer id){
        this.map.remove(id);
    }
}
