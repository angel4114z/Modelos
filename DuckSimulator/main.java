import ducks.*;
import flyBehavior.*;

public class main {
    public static void main(String[] args) {
    
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("-------------------------------");

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println("-------------------------------");

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println("-------------------------------");

        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.display();
        decoyDuck.performFly();

    }
    
    
}
