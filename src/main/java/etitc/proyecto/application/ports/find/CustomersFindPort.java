package etitc.proyecto.application.ports.find;

import java.util.List;
import java.util.UUID;

import etitc.proyecto.domain.model.Customers;

public interface CustomersFindPort {
    Customers findById(UUID id);
    List<Customers> findAll();
}
