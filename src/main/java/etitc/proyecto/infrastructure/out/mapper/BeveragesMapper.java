package etitc.proyecto.infrastructure.out.mapper;

import etitc.proyecto.domain.model.Beverages;
import etitc.proyecto.infrastructure.out.entities.BeveragesEntity;
import org.springframework.stereotype.Component;

@Component
public class BeveragesMapper {

    public Beverages toDomain(BeveragesEntity entity) {
        return Beverages.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .price(entity.getPrice())
                .build();
    }

    public BeveragesEntity toEntity(Beverages domain) {
        return BeveragesEntity.builder()
                .id(domain.getId())
                .name(domain.getName())
                .description(domain.getDescription())
                .price(domain.getPrice())
                .build();
    }
}
