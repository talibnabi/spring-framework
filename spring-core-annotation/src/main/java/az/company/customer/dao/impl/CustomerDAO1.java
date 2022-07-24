package az.company.customer.dao.impl;

import az.company.beans.User;
import az.company.customer.dao.inter.ICustomerDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "dao1")
public class CustomerDAO1 implements ICustomerDAO {

    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        list.add(new User("Talib", "Nabi", 20));
        list.add(new User("Anar", "Nabi", 20));
        list.add(new User("Tural", "Nabi", 20));
        list.add(new User("Tabriz", "Nabi", 20));
        System.out.println("DAO1");
        return list;
    }
}
