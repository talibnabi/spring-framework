package az.spring.jdbc.dao.impl;

import az.spring.jdbc.dao.inter.IEmployeeDAO;
import az.spring.jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository(value = "dao2")
public class EmployeeDAO2 implements IEmployeeDAO {

    private final NamedParameterJdbcTemplate jdbcTemplate;
//    private final JdbcTemplate jdbcTemplate;

    //    @Autowired
//    public EmployeeDAO1(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
    @Autowired
    public EmployeeDAO2(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Employee employee) {
        String query = "insert into employee(name,surname,age,salary,country_name) values(:name,:surname,:age,:salary,:country_name)";
//        jdbcTemplate.update(query, employee.getName(), employee.getSurname(), employee.getAge(), employee.getSalary(), employee.getCountryName());
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("name", employee.getName())
                .addValue("surname", employee.getSurname())
                .addValue("age", employee.getAge())
                .addValue("salary", employee.getSalary())
                .addValue("country_name", employee.getCountryName());
        jdbcTemplate.update(query, sqlParameterSource);
    }

    @Override
    public void update(Employee employee) {
        String query = "update employee set name=:name,surname=:surname,age=:age,salary=:salary,country_name=:country_name where id=:id";
//        jdbcTemplate.update(query, employee.getName(), employee.getSurname(), employee.getAge(), employee.getSalary(), employee.getCountryName(), employee.getId());
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("name", employee.getName())
                .addValue("surname", employee.getSurname())
                .addValue("age", employee.getAge())
                .addValue("salary", employee.getSalary())
                .addValue("country_name", employee.getCountryName())
                .addValue("id", employee.getId());
        jdbcTemplate.update(query, sqlParameterSource);
    }

    @Override
    public void delete(int id) {
        String query = "delete from employee where id=:id";
//        jdbcTemplate.update(query, id);
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("id", id);
        jdbcTemplate.update(query, sqlParameterSource);
    }

    @Override
    public Employee getEmployeeById(int id) {
        String query = "select * from employee where id=:id";
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("id", id);
        return jdbcTemplate.queryForObject(query, sqlParameterSource, new BeanPropertyRowMapper<>(Employee.class));
    }

//    @Override
//    public Employee getEmployeeById(int id) {
//        String query = "select * from employee where id=:id";
//        Employee employee = new Employee();
//        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
//                .addValue("id", employee.getId());
//        return jdbcTemplate.queryForObject(query, sqlParameterSource, new RowMapper<Employee>() {
//            @Override
//            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Employee employee = new Employee();
//                employee.setId(rs.getInt("id"));
//                return employee;
//            }
//        });
//    }
//
//    @Override
//    public Employee getEmployeeById(int id) {
//        String query = "select * from employee where id=?";
//        return jdbcTemplate.queryForObject(query, new RowMapper<Employee>() {
//            @Override
//            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Employee employee = new Employee();
//                employee.setId(rs.getInt("id"));
//                employee.setName(rs.getString("name"));
//                employee.setSurname(rs.getString("surname"));
//                employee.setAge(rs.getInt("age"));
//                employee.setSalary(rs.getInt("salary"));
//                employee.setCountryName(rs.getString("country_name"));
//                return employee;
//            }
//        }, id);
//    }

    @Override
    public List<Employee> getAllEmployees() {
        String query = "select * from employee";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public long count() {
        String query = "select count(*) from employee";
        return jdbcTemplate.queryForObject(query, new MapSqlParameterSource(), Long.class);
    }

}
