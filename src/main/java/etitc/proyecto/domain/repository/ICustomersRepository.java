package etitc.proyecto.domain.repository;

import etitc.proyecto.domain.model.Customers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ICustomersRepository {
    List<Customers> findAll();

    Optional<Customers> findById(UUID id);

    Customers save(Customers customers);

    void delete(Customers customers);
}
