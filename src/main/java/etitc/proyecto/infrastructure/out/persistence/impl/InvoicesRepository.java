package etitc.proyecto.infrastructure.out.persistence.impl;

import etitc.proyecto.domain.model.Invoices;
import etitc.proyecto.domain.repository.InvoicesRepository;
import etitc.proyecto.infrastructure.out.mapper.InvoicesMapper;
import etitc.proyecto.infrastructure.out.persistence.jpa.InvoicesJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class InvoicesRepository implements IInvoicesRepository {

    private final InvoicesJpaRepository jpaRepository;
    private final InvoicesMapper mapper;

    @Override
    public List<Invoices> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Invoices> findById(UUID id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public Invoices save(Invoices invoices) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(invoices)));
    }

    @Override
    public void delete(Invoices invoices) {
        jpaRepository.deleteById(invoices.getId());
    }
}
