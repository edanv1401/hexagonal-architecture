package etitc.proyecto.infrastructure.out.persistence.impl;

import etitc.proyecto.domain.model.Desserts;
import etitc.proyecto.domain.repository.IDessertsRepository;
import etitc.proyecto.infrastructure.out.mapper.DessertsMapper;
import etitc.proyecto.infrastructure.out.persistence.jpa.DessertsJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class DessertsRepository implements IDessertsRepository {

    private final DessertsJpaRepository jpaRepository;
    private final DessertsMapper mapper;

    @Override
    public List<Desserts> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Desserts> findById(UUID id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public Desserts save(Desserts desserts) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(desserts)));
    }

    @Override
    public void delete(Desserts desserts) {
        jpaRepository.deleteById(desserts.getId());
    }
}
