package az.spring.demo.dao.service;

public abstract class Device {
    private String version;
    private Integer price;

    public Device() {

    }

    public Device(String version, Integer price) {
        this.version = version;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Device{" +
                "version='" + version + '\'' +
                ", price=" + price +
                '}';
    }
}
