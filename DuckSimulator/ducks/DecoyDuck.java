package ducks;

import flyBehavior.FlyNoWay;
import quackBehavor.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("this is Decoy Duck");
    }
}
