package az.spring.demo.dao.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public abstract class Human {
    private String name;
    private String surname;
    private Integer age;
    private List<Integer> points;
    private List<Device> devices;
    private Set<Device> devicesSecond;
    private Map<Device, Integer> deviceThird;
    private Properties databaseProperty;

    public Human() {
    }

    public Human(String name, String surname, Integer age, List<Integer> points, List<Device> devices, Set<Device> devicesSecond, Map<Device, Integer> deviceThird, Properties databaseProperty) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.points = points;
        this.devices = devices;
        this.devicesSecond = devicesSecond;
        this.deviceThird = deviceThird;
        this.databaseProperty = databaseProperty;
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

    public List<Integer> getPoints() {
        return points;
    }

    public void setPoints(List<Integer> points) {
        this.points = points;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public Set<Device> getDevicesSecond() {
        return devicesSecond;
    }

    public void setDevicesSecond(Set<Device> devicesSecond) {
        this.devicesSecond = devicesSecond;
    }

    public Map<Device, Integer> getDeviceThird() {
        return deviceThird;
    }

    public void setDeviceThird(Map<Device, Integer> deviceThird) {
        this.deviceThird = deviceThird;
    }

    public Properties getDatabaseProperty() {
        return databaseProperty;
    }

    public void setDatabaseProperty(Properties databaseProperty) {
        this.databaseProperty = databaseProperty;
    }

    public abstract void read();

    public abstract void write();

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", points=" + points +
                ", devices=" + devices +
                ", devicesSecond=" + devicesSecond +
                ", deviceThird=" + deviceThird +
                ", databaseProperty=" + databaseProperty +
                '}';
    }
}
