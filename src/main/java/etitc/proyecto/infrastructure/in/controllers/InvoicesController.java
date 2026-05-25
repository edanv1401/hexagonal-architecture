package etitc.proyecto.infrastructure.in.controllers;

import etitc.proyecto.application.create.InvoicesCreateUseCase;
import etitc.proyecto.application.find.InvoicesFindUseCase;
import etitc.proyecto.domain.model.Invoices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/invoices")
public class InvoicesController {
    private final InvoicesFindUseCase invoicesFindUseCase;
    private final InvoicesCreateUseCase invoicesCreateUseCase;

    @GetMapping
    public List<Invoices> getInvoices() {
        return invoicesFindUseCase.findAll();
    }

    @GetMapping("/{id}")
    public Invoices getInvoices(@PathVariable UUID id) {
        return invoicesFindUseCase.findById(id);
    }

    @PostMapping
    public Invoices createInvoice(@RequestBody Invoices invoices) {
        return invoicesCreateUseCase.create(invoices);
    }
}
