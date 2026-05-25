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
@Table(name = "invoice")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private Client client;
    @Column
    private Employee employee;
    @Column
    private LocalDateTime createdAt;
    @Column
    private Double total;
    @Column
    private List<InvoiceDetail> details;
}