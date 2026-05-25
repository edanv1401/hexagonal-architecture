package etitc.proyecto.application.find;

import etitc.proyecto.domain.exception.InvoiceNotFound;
import etitc.proyecto.domain.model.Invoices;
import etitc.proyecto.domain.repository.InvoicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class InvoicesFindUseCase {
    private final InvoicesRepository invoicesRepository;

    public List<Invoices> findAll() {
        return invoicesRepository.findAll();
    }

    public Invoices findById(UUID id) {
        return invoicesRepository.findById(id)
                .orElseThrow(() -> new InvoiceNotFound(
                        String.format("Invoice with id %s not found", id)));
    }
}
