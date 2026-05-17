package etitc.proyecto.application.find;

import etitc.proyecto.domain.exception.BeverageNotFound;
import etitc.proyecto.domain.model.Beverages;
import etitc.proyecto.domain.repository.IBeveragesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BeveragesFindUseCase {
    private final IBeveragesRepository beveragesRepository;

    public List<Beverages> findAll() {
        return beveragesRepository.findAll();
    }

    public Beverages findById(UUID id) {
        return beveragesRepository.findById(id)
                .orElseThrow(() -> new BeverageNotFound(
                        String.format("Beverage with id %s not found", id)));
    }
}
