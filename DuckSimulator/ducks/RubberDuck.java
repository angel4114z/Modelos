package ducks;

import quackBehavor.Squeak;
import flyBehavior.*;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("This is a rubber duck");
    }
}
