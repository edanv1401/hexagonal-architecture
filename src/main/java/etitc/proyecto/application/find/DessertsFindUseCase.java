package etitc.proyecto.application.find;

import etitc.proyecto.domain.exception.DessertNotFound;
import etitc.proyecto.domain.model.Desserts;
import etitc.proyecto.domain.repository.IDessertsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DessertsFindUseCase {
    private final IDessertsRepository dessertsRepository;

    public Desserts findById(UUID id) {
        return dessertsRepository.findById(id)
                .orElseThrow(() -> new DessertNotFound(
                        String.format("Dessert with id %s not found", id)));
    }

    public List<Desserts> findAll() {
        return dessertsRepository.findAll();
    }
}
