package etitc.proyecto.infrastructure.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoice")
@Inheritance(strategy = InheritanceType.JOINED)
public class InvoicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private CustomersEntity client;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private PersonEntity employee;

    @Column
    private LocalDateTime createdAt;

    @Column
    private Double total;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Invoice> details;
}