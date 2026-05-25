package etitc.proyecto.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder

public class Invoices {
    private UUID id;
    private Customer customer;
    private LocalDateTime createdAt;
    private Double total;
    private List<InvoiceDetail> details;
}