package etitc.proyecto.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Desserts {
    private UUID id;
    private String name;
    private String description;
    private Double price;
}
