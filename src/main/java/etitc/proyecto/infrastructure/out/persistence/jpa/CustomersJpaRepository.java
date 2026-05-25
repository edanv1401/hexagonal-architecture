package etitc.proyecto.infrastructure.out.persistence.jpa;

import etitc.proyecto.infrastructure.out.entities.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomersJpaRepository extends JpaRepository<CustomersEntity, UUID> {
}
