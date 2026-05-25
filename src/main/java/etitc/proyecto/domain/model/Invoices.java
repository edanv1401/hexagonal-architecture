package etitc.proyecto.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Invoices {
    private UUID id;
    private Customers customer;
    private LocalDateTime createdAt;
    private Double total;
    private List<InvoiceDetail> details;
}