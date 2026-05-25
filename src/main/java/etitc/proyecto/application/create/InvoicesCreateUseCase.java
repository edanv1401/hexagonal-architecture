package etitc.proyecto.application.create;

import etitc.proyecto.domain.model.Invoices;
import etitc.proyecto.domain.repository.InvoicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InvoicesCreateUseCase {

    private final InvoicesRepository invoicesRepository;

    public Invoices create(Invoices invoices) {
        return invoicesRepository.save(invoices);
    }
}
