package etitc.proyecto.infrastructure.out.persistence.jpa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import etitc.proyecto.infrastructure.out.entities.SucursalEntity;

public interface SucursalsJpaRepository extends JpaRepository<SucursalEntity, UUID> {
}
