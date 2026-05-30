package etitc.proyecto.infrastructure.out.mapper;

import org.springframework.stereotype.Component;

import etitc.proyecto.domain.model.Sucursal;
import etitc.proyecto.infrastructure.out.entities.SucursalEntity;

@Component
public class SucursalsMapper {
    public Sucursal toDomain(SucursalEntity entity) {
        return Sucursal.builder()
                .name(entity.getName())
                .street(entity.getStreet())
                .build();
    }
}
