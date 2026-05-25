package etitc.proyecto.infrastructure.out.persistence.impl;

import etitc.proyecto.domain.model.Customers;
import etitc.proyecto.domain.repository.ICustomersRepository;
import etitc.proyecto.infrastructure.out.mapper.CustomersMapper;
import etitc.proyecto.infrastructure.out.persistence.jpa.CustomersJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class CustomersRepository implements ICustomersRepository {

    private final CustomersJpaRepository jpaRepository;
    private final CustomersMapper mapper;

    @Override
    public List<Customers> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Customers> findById(UUID id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public Customers save(Customers customers) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(customers)));
    }

    @Override
    public void delete(Customers customers) {
        jpaRepository.deleteById(customers.getId());
    }
}
