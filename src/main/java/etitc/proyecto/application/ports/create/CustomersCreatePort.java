package etitc.proyecto.application.ports.create;

import etitc.proyecto.domain.model.Customers;

public interface CustomersCreatePort {
    Customers create(Customers customers);
}
