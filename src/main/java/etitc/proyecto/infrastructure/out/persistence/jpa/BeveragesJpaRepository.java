package etitc.proyecto.infrastructure.out.persistence.jpa;

import etitc.proyecto.infrastructure.out.entities.BeveragesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeveragesJpaRepository extends JpaRepository<BeveragesEntity, UUID> {
}
