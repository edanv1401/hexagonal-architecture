package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.ports.create.BeverageCreatePort;
import etitc.proyecto.application.ports.find.BeveragesFindPort;
import etitc.proyecto.domain.model.Beverages;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/beverages")
public class BeveragesController {
    private final BeveragesFindPort beveragesFindPort;
    private final BeverageCreatePort beverageCreatePort;

    @GetMapping
    public List<Beverages> getBeverages() {
        return beveragesFindPort.findAll();
    }

    @GetMapping("/{id}")
    public Beverages getBeverages(@PathVariable UUID id) {
        return beveragesFindPort.findById(id);
    }

    @PostMapping
    public Beverages createBeverage(@RequestBody Beverages beverages) {
        return beverageCreatePort.create(beverages);
    }
}
