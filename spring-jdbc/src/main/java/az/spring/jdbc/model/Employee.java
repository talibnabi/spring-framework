package az.spring.jdbc.model;

public class Employee {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Integer salary;
    private String countryName;

    public Employee() {
    }

    public Employee(Integer id, String name, String surname, Integer age, Integer salary, String countryName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
