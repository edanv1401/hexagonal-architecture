package etitc.proyecto.application.ports.find;

import java.util.List;
import java.util.UUID;

import etitc.proyecto.domain.model.Sucursal;

public interface SucursalFindPort {
    Sucursal findById(UUID id);
    List<Sucursal> findAll();
    List<Sucursal> findRelatedSucursals(String name);
}
