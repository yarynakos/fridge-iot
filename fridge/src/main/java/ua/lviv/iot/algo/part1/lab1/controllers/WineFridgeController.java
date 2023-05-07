package ua.lviv.iot.algo.part1.lab1.controllers;

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

    public WineFridgeController(WineFridgeService wineFridgeService) {
        this.wineFridgeService = wineFridgeService;
    }

    @GetMapping
    public Collection<WineFridge> getAllFridges() {
        return this.wineFridgeService.getAllFridges();
    }

    @GetMapping("/:id")
    public WineFridge getFridgeById(@PathVariable("id") Integer id) {
        return this.wineFridgeService.getFridgeById(id);
    }

    @PostMapping
    public WineFridge addFridge(@RequestBody WineFridge entity) {
        return this.wineFridgeService.addFridge(entity);
    }

    @PutMapping("/:id")
    public WineFridge editFridge(@PathVariable Integer id, @RequestBody WineFridge entity) {
        return this.wineFridgeService.editFridge(id, entity);
    }

    @DeleteMapping("/:id")
    public void deleteFridge(@PathVariable Integer id) {
        this.wineFridgeService.deleteFridge(id);
    }
}
