package etitc.proyecto.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class InvoiceDetail {
    private UUID id;
    private Long productId;
    private String productType;
    private Integer quantity;
    private Double price;
}