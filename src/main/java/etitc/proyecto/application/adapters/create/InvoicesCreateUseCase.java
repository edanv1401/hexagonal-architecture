package etitc.proyecto.application.adapters.create;

import etitc.proyecto.application.ports.create.InvoicesCreatePort;
import etitc.proyecto.domain.model.Invoices;
import etitc.proyecto.domain.repository.InvoicesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InvoicesCreateUseCase implements InvoicesCreatePort{

    private final InvoicesRepository invoicesRepository;

    @Override
    public Invoices create(Invoices invoices) {
        return invoicesRepository.save(invoices);
    }
}
