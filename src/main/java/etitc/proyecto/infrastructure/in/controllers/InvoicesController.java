package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.ports.create.InvoicesCreatePort;
import etitc.proyecto.application.ports.find.InvoicesFindPort;
import etitc.proyecto.domain.model.Invoices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/invoices")
public class InvoicesController {
    private final InvoicesFindPort invoicesFindPort;
    private final InvoicesCreatePort invoicesCreatePort;

    @GetMapping
    public List<Invoices> getInvoices() {
        return invoicesFindPort.findAll();
    }

    @GetMapping("/{id}")
    public Invoices getInvoices(@PathVariable UUID id) {
        return invoicesFindPort.findById(id);
    }

    @PostMapping
    public Invoices createInvoice(@RequestBody Invoices invoices) {
        return invoicesCreatePort.create(invoices);
    }
}
