package az.company.customer.dao.impl;

import az.company.beans.User;
import az.company.customer.dao.inter.ICustomerDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository(value = "dao2")
public class CustomerDAO2 implements ICustomerDAO {
    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        list.add(new User("Amin","Kazim",19));
        list.add(new User("Mehdi","Kazim",19));
        list.add(new User("Hasan","Kazim",19));
        list.add(new User("Tural","Kazim",19));
        System.out.println("DAO2");
        return list;
    }
}
