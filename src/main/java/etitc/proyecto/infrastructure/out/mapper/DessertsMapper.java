package etitc.proyecto.infrastructure.out.mapper;

import etitc.proyecto.domain.model.Desserts;
import etitc.proyecto.infrastructure.out.entities.DessertsEntity;
import org.springframework.stereotype.Component;

@Component
public class DessertsMapper {

    public Desserts toDomain(DessertsEntity entity) {
        return Desserts.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .build();
    }

    public DessertsEntity toEntity(Desserts domain) {
        return DessertsEntity.builder()
                .id(domain.getId())
                .name(domain.getName())
                .description(domain.getDescription())
                .price(domain.getPrice())
                .build();
    }
}
