package etitc.proyecto.application.adapters.create;

import etitc.proyecto.application.ports.create.DessertsCreatePort;
import etitc.proyecto.domain.model.Desserts;
import etitc.proyecto.domain.repository.IDessertsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DessertsCreateUseCase implements DessertsCreatePort{

    private final IDessertsRepository dessertsRepository;

    @Override
    public Desserts create(Desserts desserts) {
        return dessertsRepository.save(desserts);
    }
}
