package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.create.BeveragesCreateUseCase;
import etitc.proyecto.application.find.BeveragesFindUseCase;
import etitc.proyecto.domain.model.Beverages;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/beverages")
public class BeveragesController {
    private final BeveragesFindUseCase beveragesFindUseCase;
    private final BeveragesCreateUseCase beveragesCreateUseCase;

    @GetMapping
    public List<Beverages> getBeverages() {
        return beveragesFindUseCase.findAll();
    }

    @GetMapping("/{id}")
    public Beverages getBeverages(@PathVariable UUID id) {
        return beveragesFindUseCase.findById(id);
    }

    @PostMapping
    public Beverages createBeverage(@RequestBody Beverages beverages) {
        return beveragesCreateUseCase.create(beverages);
    }
}
