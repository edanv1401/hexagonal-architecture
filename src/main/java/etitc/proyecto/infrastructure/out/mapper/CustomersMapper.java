package etitc.proyecto.infrastructure.out.mapper;

import etitc.proyecto.domain.model.Customers;
import etitc.proyecto.infrastructure.out.entities.CustomersEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomersMapper {

    public Customers toDomain(CustomersEntity entity) {
        return Customers.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .build();
    }

    public CustomersEntity toEntity(Customers domain) {
        return CustomersEntity.builder()
                .id(domain.getId())
                .firstName(domain.getFirstName())
                .lastName(domain.getLastName())
                .email(domain.getEmail())
                .phone(domain.getPhone())
                .build();
    }
}