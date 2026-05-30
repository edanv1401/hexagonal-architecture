package etitc.proyecto.infrastructure.out.persistence.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import etitc.proyecto.domain.model.Sucursal;
import etitc.proyecto.domain.repository.ISucursalsRepository;
import etitc.proyecto.infrastructure.out.mapper.SucursalsMapper;
import etitc.proyecto.infrastructure.out.persistence.jpa.SucursalsJpaRepository;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class SucursalsRepository implements ISucursalsRepository {
    private final SucursalsJpaRepository jpaRepository;
    private final SucursalsMapper mapper;

    @Override
    public List<Sucursal> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Sucursal> findById(UUID id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

}
