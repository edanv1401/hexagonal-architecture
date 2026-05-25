package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.ports.create.CustomersCreatePort;
import etitc.proyecto.application.ports.find.CustomersFindPort;
import etitc.proyecto.domain.model.Customers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomersController {
    private final CustomersFindPort customersFindPort;
    private final CustomersCreatePort customersCreatePort;

    @GetMapping
    public List<Customers> getCustomers() {
        return customersFindPort.findAll();
    }

    @GetMapping("/{id}")
    public Customers getCustomers(@PathVariable UUID id) {
        return customersFindPort.findById(id);
    }

    @PostMapping
    public Customers createCustomer(@RequestBody Customers customers) {
        return customersCreatePort.create(customers);
    }
}
