package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.create.DessertsCreateUseCase;
import etitc.proyecto.application.find.DessertsFindUseCase;
import etitc.proyecto.domain.model.Desserts;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/desserts")
public class DessertsController {
    private final DessertsFindUseCase dessertsFindUseCase;
    private final DessertsCreateUseCase dessertsCreateUseCase;

    @GetMapping
    public List<Desserts> findAll() {
        return dessertsFindUseCase.findAll();
    }

    @GetMapping("/{id}")
    public Desserts findById(@PathVariable UUID id) {
        return dessertsFindUseCase.findById(id);
    }

    @PostMapping
    public Desserts createDessert(@RequestBody Desserts desserts) {
        return dessertsCreateUseCase.create(desserts);
    }
}
