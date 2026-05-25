package etitc.proyecto.application.ports.find;

import java.util.List;
import java.util.UUID;

import etitc.proyecto.domain.model.Invoices;

public interface InvoicesFindPort {
    Invoices findById(UUID id);
    List<Invoices> findAll();
}
