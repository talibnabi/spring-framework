package spring.beans;

public class User {
    private String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
