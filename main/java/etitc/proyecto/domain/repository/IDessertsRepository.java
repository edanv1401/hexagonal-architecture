package etitc.proyecto.domain.repository;

import etitc.proyecto.domain.model.Desserts;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IDessertsRepository {
    List<Desserts> findAll();

    Optional<Desserts> findById(UUID id);

    Desserts save(Desserts desserts);

    void delete(Desserts desserts);
}
