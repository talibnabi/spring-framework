package az.spring.demo.dao.service;

import az.spring.demo.dao.main.Info;

public abstract class Car {
    private String carVersion;
    private Integer carYear;

    public Car() {

    }

    public Car(String carVersion, Integer carYear) {
        this.carVersion = carVersion;
        this.carYear = carYear;
    }

    public String getCarVersion() {
        return carVersion;
    }

    public void setCarVersion(String carVersion) {
        this.carVersion = carVersion;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carVersion='" + carVersion + '\'' +
                ", carYear=" + carYear +
                '}';
    }
}
