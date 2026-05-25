package etitc.proyecto.application.ports.find;

import java.util.List;
import java.util.UUID;

import etitc.proyecto.domain.model.Beverages;

public interface BeveragesFindPort {
    List<Beverages> findAll();
    Beverages findById(UUID id);
}
