package az.spring.demo.impl;

import az.spring.demo.inter.Device;

public class Hammer implements Device {
    public String name;
    public Integer version;

    public Hammer() {
    }

    public Hammer(String name, Integer version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public void send() {
        System.out.println("Hammer was sold.");
    }
}
