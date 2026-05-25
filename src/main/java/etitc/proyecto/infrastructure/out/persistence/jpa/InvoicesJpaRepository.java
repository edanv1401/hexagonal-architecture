package etitc.proyecto.infrastructure.out.persistence.jpa;

import etitc.proyecto.infrastructure.out.entities.InvoicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvoicesJpaRepository extends JpaRepository<InvoicesEntity, UUID> {
}
