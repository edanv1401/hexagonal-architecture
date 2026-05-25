package etitc.proyecto.infrastructure.out.mapper;

import etitc.proyecto.domain.model.Invoices;
import etitc.proyecto.infrastructure.out.entities.InvoicesEntity;
import org.springframework.stereotype.Component;

@Component
public class InvoicesMapper {

    public Invoices toDomain(InvoicesEntity entity) {
        return Invoices.builder()
                .id(entity.getId())
                .createdAt(entity.getCreatedAt())
                .total(entity.getTotal())
                .build();
    }

    public InvoicesEntity toEntity(Invoices domain) {
        return InvoicesEntity.builder()
                .id(domain.getId())
                .total(domain.getTotal())
                .build();
    }
}