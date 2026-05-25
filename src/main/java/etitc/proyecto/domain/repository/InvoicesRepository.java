package etitc.proyecto.domain.repository;

import etitc.proyecto.domain.model.Invoices;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface InvoicesRepository {
    List<Invoices> findAll();

    Optional<Invoices> findById(UUID id);

    Invoices save(Invoices invoices);

    void delete(Invoices invoices);
}