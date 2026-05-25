package etitc.proyecto.application.ports.create;

import etitc.proyecto.domain.model.Beverages;

public interface BeverageCreatePort {
    Beverages create(Beverages beverages);
}
