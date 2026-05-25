package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.ports.create.DessertsCreatePort;
import etitc.proyecto.application.ports.find.DessertsFindPort;
import etitc.proyecto.domain.model.Desserts;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/desserts")
public class DessertsController {
    private final DessertsFindPort dessertsFindPort;
    private final DessertsCreatePort dessertsCreatePort;

    @GetMapping
    public List<Desserts> findAll() {
        return dessertsFindPort.findAll();
    }

    @GetMapping("/{id}")
    public Desserts findById(@PathVariable UUID id) {
        return dessertsFindPort.findById(id);
    }

    @PostMapping
    public Desserts createDessert(@RequestBody Desserts desserts) {
        return dessertsCreatePort.create(desserts);
    }
}
