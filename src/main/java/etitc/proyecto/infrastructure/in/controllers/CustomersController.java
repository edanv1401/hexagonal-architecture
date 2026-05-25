package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.create.CustomersCreateUseCase;
import etitc.proyecto.application.find.CustomersFindUseCase;
import etitc.proyecto.domain.model.Customers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomersController {
    private final CustomersFindUseCase customersFindUseCase;
    private final CustomersCreateUseCase customersCreateUseCase;

    @GetMapping
    public List<Customers> getCustomers() {
        return customersFindUseCase.findAll();
    }

    @GetMapping("/{id}")
    public Customers getCustomers(@PathVariable UUID id) {
        return customersFindUseCase.findById(id);
    }

    @PostMapping
    public Customers createCustomer(@RequestBody Customers customers) {
        return customersCreateUseCase.create(customers);
    }
}
