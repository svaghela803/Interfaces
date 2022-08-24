package model;

import model.interfaces.*;

public class Animal implements IEat, IFlee, ISleep, ISwim, IPrey, IAnimal {


    public void eat() {
        System.out.println("Eating");
    }


    public void sleep() {
        System.out.println("Sleeping");
    }


    public void swim() {
        System.out.println("Swimming");
    }


    public void flee() {
        System.out.println("Fleeing from a predator");
    }


    public void jump() {
        System.out.println("JUMP");
    }


    public void prey() {
        System.out.println("My eating time");
    }
}


