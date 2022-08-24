package model;

import model.interfaces.*;

public class Seal implements IAnimal, ISwim, IPrey, IEat, ISleep, IFlee {

    @Override
    public void eat() {
        System.out.println("Seal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Seal is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Seal is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Seal is fleeing from a predator");
    }

    @Override
       public void jump() {
            System.out.println("JUMP");
        }

    @Override
        public void prey() {
            System.out.println("Eating time");
        }
}
