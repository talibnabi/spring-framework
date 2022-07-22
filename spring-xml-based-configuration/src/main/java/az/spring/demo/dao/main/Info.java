package az.spring.demo.dao.main;

import az.spring.demo.dao.service.Mechanic;
import az.spring.demo.dao.service.Human;

public class Info {
    private Mechanic mechanic;
    private Human human;

//    public Info(Mechanic mechanic, Human human) {
//        this.mechanic = mechanic;
//        this.human = human;
//    }


    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public void sendInfo() {
        this.mechanic.start();
        this.mechanic.speedUp();
        this.mechanic.stop();
        System.out.println("-------------------------------------------------------");
        this.human.read();
        this.human.write();
        System.out.println(this.human.toString());
        System.out.println(this.mechanic.toString());
    }
}
