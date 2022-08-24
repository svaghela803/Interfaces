package model;

import model.interfaces.*;

public class Puffin implements IFly, ISwim, IEat, ISleep, IFlee, IAnimal {
    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from preditor");
    }
    
    public void jump() {
            System.out.println("Puffin is jumping");
        }
}
