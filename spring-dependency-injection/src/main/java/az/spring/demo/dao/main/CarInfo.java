package az.spring.demo.dao.main;

import az.spring.demo.dao.inter.Car;

public class CarInfo {
    private Car car;

    public CarInfo(Car car) {
        this.car = car;
    }

//    public void setCar(Car car) {
//        this.car = car;
//    }

    public void sendInfo() {
        this.car.start();
        this.car.speedUp();
        this.car.stop();
        System.out.println("---------------------");
    }
}
