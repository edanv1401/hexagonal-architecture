package etitc.proyecto.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import etitc.proyecto.domain.model.Sucursal;

public interface ISucursalsRepository {
    List<Sucursal> findAll();

    Optional<Sucursal> findById(UUID id);
}
