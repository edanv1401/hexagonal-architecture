package etitc.proyecto.application.adapters.create;

import etitc.proyecto.application.ports.create.BeverageCreatePort;
import etitc.proyecto.domain.model.Beverages;
import etitc.proyecto.domain.repository.IBeveragesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BeveragesCreateUseCase implements BeverageCreatePort{

    private final IBeveragesRepository beveragesRepository;

    @Override
    public Beverages create(Beverages beverages) {
        return beveragesRepository.save(beverages);
    }
}
