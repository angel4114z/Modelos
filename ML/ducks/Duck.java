package ducks;
import flyBehavior.FlyBehavior;
import quackBehavor.QuackBehavior;

//implement Mallard, Rubber, Decoy subclases with his methods

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}

    public abstract void display();

    public void perfomFly(){
        flyBehavior.fly();
    }

    public void perfomQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck float, even decoys!");
    }



}