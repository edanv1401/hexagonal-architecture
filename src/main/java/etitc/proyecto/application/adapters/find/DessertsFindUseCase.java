package etitc.proyecto.application.adapters.find;

import etitc.proyecto.application.ports.find.DessertsFindPort;
import etitc.proyecto.domain.exception.DessertNotFound;
import etitc.proyecto.domain.model.Desserts;
import etitc.proyecto.domain.repository.IDessertsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DessertsFindUseCase implements DessertsFindPort {
    private final IDessertsRepository dessertsRepository;

    @Override
    public Desserts findById(UUID id) {
        return dessertsRepository.findById(id)
                .orElseThrow(() -> new DessertNotFound(
                        String.format("Dessert with id %s not found", id)));
    }

    @Override
    public List<Desserts> findAll() {
        return dessertsRepository.findAll();
    }
}
