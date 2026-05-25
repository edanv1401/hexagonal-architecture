package etitc.proyecto.infrastructure.out.mapper;

import etitc.proyecto.domain.model.InvoiceDetail;
import etitc.proyecto.infrastructure.out.entities.InvoiceDetailEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InvoiceMapper {

    private final CustomerMapper customerMapper;
    private final InvoiceDetailMapper detailMapper;

    public Invoice toDomain(InvoiceEntity entity) {

        return Invoice.builder()
                .id(entity.getId())
                .customer(customerMapper.toDomain(entity.getCustomer()))
                .details(
                        entity.getDetails()
                                .stream()
                                .map(detailMapper::toDomain)
                                .toList()
                )
                .total(entity.getTotal())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public InvoiceEntity toEntity(Invoice domain) {

        InvoiceEntity entity = InvoiceEntity.builder()
                .id(domain.getId())
                .customer(customerMapper.toEntity(domain.getCustomer()))
                .total(domain.getTotal())
                .createdAt(domain.getCreatedAt())
                .build();

        entity.setDetails(
                domain.getDetails()
                        .stream()
                        .map(detail -> {
                            InvoiceDetailEntity detailEntity =
                                    detailMapper.toEntity(detail);

                            detailEntity.setInvoice(entity);

                            return detailEntity;
                        })
                        .toList()
        );

        return entity;
    }
}