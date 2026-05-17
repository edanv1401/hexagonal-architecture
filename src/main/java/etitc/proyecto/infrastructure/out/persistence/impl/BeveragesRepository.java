package etitc.proyecto.infrastructure.out.persistence.impl;

import etitc.proyecto.domain.model.Beverages;
import etitc.proyecto.domain.repository.IBeveragesRepository;
import etitc.proyecto.infrastructure.out.mapper.BeveragesMapper;
import etitc.proyecto.infrastructure.out.persistence.jpa.BeveragesJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class BeveragesRepository implements IBeveragesRepository {

    private final BeveragesJpaRepository jpaRepository;
    private final BeveragesMapper mapper;

    @Override
    public List<Beverages> findAll() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Beverages> findById(UUID id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public Beverages save(Beverages beverages) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(beverages)));
    }

    @Override
    public void delete(Beverages beverages) {
        jpaRepository.deleteById(beverages.getId());
    }
}
