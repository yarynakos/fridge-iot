package ua.lviv.iot.algo.part1.lab1.controllers;

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
import ua.lviv.iot.algo.part1.lab1.services.WineFridgeService;

import java.util.Collection;

@RestController
@RequestMapping("/fridges")
public class WineFridgeController {
    private final WineFridgeService wineFridgeService;

    public  WineFridgeController(WineFridgeService wineFridgeService) {
        this.wineFridgeService = wineFridgeService;
    }

    @GetMapping
    public ResponseEntity<Collection<WineFridge>> getAllFridges() {
        return ResponseEntity.ok(this.wineFridgeService.getAllFridges());
    }

    @GetMapping("/:id")
    public ResponseEntity<WineFridge> getFridgeById(@PathVariable("id") Integer id) {
        WineFridge entity = this.wineFridgeService.getFridgeById(id);
        if (entity == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public ResponseEntity<WineFridge> addFridge(@RequestBody WineFridge entity) {
        return ResponseEntity.ok( this.wineFridgeService.addFridge(entity));
    }

    @PutMapping("/:id")
    public ResponseEntity<WineFridge> editFridge(@PathVariable Integer id, @RequestBody WineFridge entity) {
        WineFridge entity1 = this.wineFridgeService.editFridge(id, entity);
        if (entity1 == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity1);
    }

    @DeleteMapping("/:id")
    public ResponseEntity<String> deleteFridge(@PathVariable Integer id) {
        WineFridge entity1 = this.wineFridgeService.getFridgeById(id);
        if (entity1 == null){
            return ResponseEntity.notFound().build();
        }
        this.wineFridgeService.deleteFridge(id);
        return ResponseEntity.ok("fridge with id: " + id);
    }
}
