package model;

import model.interfaces.*;

public class Eagle  implements IFly, IHunt, IAnimal, ISleep, IEat {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

   // @Override
    public void hunt() {
        System.out.println("Eagle is flying");
    }

    public void jump() {
            System.out.println("Eagle is jumping");
        }

    public void sleep() {
                    System.out.println("sleep");
                }

    public void eat() {
                System.out.println("eat");
            }

    public Stg getE


}
