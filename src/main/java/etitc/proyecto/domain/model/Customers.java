package etitc.proyecto.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Customers {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}