package az.spring.jdbc.service.inter;

import az.spring.jdbc.dao.inter.IEmployeeDAO;
import az.spring.jdbc.model.Employee;

import java.util.List;

public interface IEmployeeService {
    void insert(Employee employee);

    void update(Employee employee);

    void delete(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    long count();
}
