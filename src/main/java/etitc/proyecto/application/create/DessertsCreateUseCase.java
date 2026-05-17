package etitc.proyecto.application.create;

import etitc.proyecto.domain.model.Desserts;
import etitc.proyecto.domain.repository.IDessertsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DessertsCreateUseCase {

    private final IDessertsRepository dessertsRepository;

    public Desserts create(Desserts desserts) {
        return dessertsRepository.save(desserts);
    }
}
