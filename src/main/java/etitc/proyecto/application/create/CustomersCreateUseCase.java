package etitc.proyecto.application.create;

import etitc.proyecto.domain.model.Customers;
import etitc.proyecto.domain.repository.ICustomersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersCreateUseCase {

    private final ICustomersRepository customersRepository;

    public Customers create(Customers customers) {
        return customersRepository.save(customers);
    }
}
