package etitc.proyecto.application.create;

import etitc.proyecto.domain.model.Beverages;
import etitc.proyecto.domain.repository.IBeveragesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BeveragesCreateUseCase {

    private final IBeveragesRepository beveragesRepository;

    public Beverages create(Beverages beverages) {
        return beveragesRepository.save(beverages);
    }
}
