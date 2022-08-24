package model;

import model.interfaces.*;

// Hint: missing an interface and a method implementation
public class Tiger implements ISwim, ISleep, IEat, IHunt, IRun, IAnimal {


        @Override
        public void eat() {
            System.out.println("Tiger is eating");
        }

        @Override
        public void sleep() {
            System.out.println("Tiger is sleeping");
        }

        @Override
        public void swim() {
            System.out.println("Tiger is swimming");
        }

        @Override
        public void hunt(){
        System.out.println("Tiger is hunting");
                }

        @Override
        public void jump(){
                System.out.println("Tiger is jump");
                        }

        @Override
        public void run(){
                System.out.println("Tiger is running");
                                }

}
