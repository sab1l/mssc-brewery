package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Override
    public CustomerDto getCustomerById(UUID customerId)
    {
        return CustomerDto.builder().id(UUID.randomUUID()).customerName("sabil").build();
    }
}
