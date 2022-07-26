package az.spring.jdbc.service.impl;

import az.spring.jdbc.dao.inter.IEmployeeDAO;
import az.spring.jdbc.model.Employee;
import az.spring.jdbc.service.inter.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    private final IEmployeeDAO iEmployeeDAO;

    @Autowired
    public EmployeeService(@Qualifier(value = "dao1") IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    @Override
    public void insert(Employee employee) {
        iEmployeeDAO.insert(employee);
    }

    @Override
    public void update(Employee employee) {
        iEmployeeDAO.update(employee);
    }

    @Override
    public void delete(int id) {
        iEmployeeDAO.delete(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return iEmployeeDAO.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return iEmployeeDAO.getAllEmployees();
    }

    @Override
    public long count() {
        return iEmployeeDAO.count();
    }
}
