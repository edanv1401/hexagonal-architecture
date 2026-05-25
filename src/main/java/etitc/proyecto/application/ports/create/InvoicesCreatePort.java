package etitc.proyecto.application.ports.create;

import etitc.proyecto.domain.model.Invoices;

public interface InvoicesCreatePort {
    Invoices create(Invoices invoices);
}
