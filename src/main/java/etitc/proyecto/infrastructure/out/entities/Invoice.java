package etitc.proyecto.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoice_detail")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private Long productId;
    @Column
    private String productType;
    @Column
    private Integer quantity;
    @Column
    private Double price;
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private InvoicesEntity invoice;
}