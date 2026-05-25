package etitc.proyecto.application.adapters.create;

import etitc.proyecto.application.ports.create.CustomersCreatePort;
import etitc.proyecto.domain.model.Customers;
import etitc.proyecto.domain.repository.ICustomersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomersCreateUseCase implements CustomersCreatePort{

    private final ICustomersRepository customersRepository;

    @Override
    public Customers create(Customers customers) {
        return customersRepository.save(customers);
    }
}
