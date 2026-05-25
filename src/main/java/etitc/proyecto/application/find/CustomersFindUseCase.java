package etitc.proyecto.application.find;

import etitc.proyecto.domain.exception.CustomerNotFound;
import etitc.proyecto.domain.model.Customers;
import etitc.proyecto.domain.repository.ICustomersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CustomersFindUseCase {
    private final ICustomersRepository customersRepository;

    public List<Customers> findAll() {
        return customersRepository.findAll();
    }

    public Customers findById(UUID id) {
        return customersRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFound(
                        String.format("Customer with id %s not found", id)));
    }
}
