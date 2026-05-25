package etitc.proyecto.application.ports.find;

import java.util.List;
import java.util.UUID;

import etitc.proyecto.domain.model.Desserts;

public interface DessertsFindPort {
    Desserts findById(UUID id);
    List<Desserts> findAll();
}
