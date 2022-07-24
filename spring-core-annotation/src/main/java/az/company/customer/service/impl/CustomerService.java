package az.company.customer.service.impl;

import az.company.beans.User;
import az.company.customer.dao.inter.ICustomerDAO;
import az.company.customer.service.inter.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired(required = true)
    @Qualifier(value = "dao2")
    private ICustomerDAO customerDAO;

    @Override
    public List<User> getAllUser() {
        return customerDAO.getAllUser();
    }
}
