package etitc.proyecto.infrastructure.out.persistence.jpa;

import etitc.proyecto.infrastructure.out.entities.DessertsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DessertsJpaRepository extends JpaRepository<DessertsEntity, UUID> {
}
