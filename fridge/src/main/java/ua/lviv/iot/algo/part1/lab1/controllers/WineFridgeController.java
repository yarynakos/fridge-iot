package ua.lviv.iot.algo.part1.lab1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.algo.part1.lab1.models.WineFridge;
import ua.lviv.iot.algo.part1.lab1.services.*;

import java.util.Collection;

@RestController
@RequestMapping("/fridge")
public class WineFridgeController {

    private final WineFridgeService wineFridgeService;

    @Autowired
    public WineFridgeController(WineFridgeService wineFridge) {
        wineFridgeService = wineFridge;
    }

    @GetMapping
    public ResponseEntity<Collection<WineFridge>> getAllFridges() {
        return ResponseEntity.ok(wineFridgeService.getAllFridges());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WineFridge> getFridgeById(@PathVariable("id") Integer id) {
        WineFridge entity = wineFridgeService.getFridgeById(id);
        if (entity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public ResponseEntity<WineFridge> addFridge(@RequestBody WineFridge entity) {
        return ResponseEntity.ok(wineFridgeService.addFridge(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WineFridge> editFridge(@PathVariable Integer id, @RequestBody WineFridge entity) {
        WineFridge foundEntity = wineFridgeService.editFridge(id, entity);
        if (foundEntity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(foundEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFridge(@PathVariable Integer id) {
        WineFridge fridgeById = wineFridgeService.getFridgeById(id);
        if (fridgeById == null) {
            return ResponseEntity.notFound().build();
        }
        wineFridgeService.deleteFridge(id);
        return ResponseEntity.ok("fridge with id: " + id);
    }
}
