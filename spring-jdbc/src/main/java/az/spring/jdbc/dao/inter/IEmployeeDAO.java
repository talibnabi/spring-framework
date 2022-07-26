package az.spring.jdbc.dao.inter;

import az.spring.jdbc.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IEmployeeDAO {
    void insert(Employee employee);

    void update(Employee employee);

    void delete(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    long count();

}
