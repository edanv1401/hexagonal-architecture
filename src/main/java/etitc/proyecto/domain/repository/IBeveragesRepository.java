package etitc.proyecto.domain.repository;

import etitc.proyecto.domain.model.Beverages;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IBeveragesRepository {
    List<Beverages> findAll();

    Optional<Beverages> findById(UUID id);

    Beverages save(Beverages beverages);

    void delete(Beverages beverages);
}
