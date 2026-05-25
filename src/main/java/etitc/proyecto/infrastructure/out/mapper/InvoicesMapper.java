package etitc.proyecto.infrastructure.out.mapper;

import etitc.proyecto.domain.model.Invoices;
import etitc.proyecto.infrastructure.out.entities.InvoicesEntity;
import org.springframework.stereotype.Component;

@Component
public class InvoicesMapper {

    public Invoices toDomain(InvoicesEntity entity) {
        return Invoices.builder()
                .id(entity.getId())
                .customer(entity.getCustomer())
                .createdAt(entity.getCreatedAt())
                .total(entity.getTotal())
                .details(entity.getDetails())
                .build();
    }

    public InvoicesEntity toEntity(Invoices domain) {
        return InvoicesEntity.builder()
                .id(domain.getId())
                .customer(domain.getCustomer())
                .createdAt(domain.getCustomer())
                .total(domain.getTotal())
                .details(domain.getDetails())
                .build();
    }
}