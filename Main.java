public class Main 
{

    public static void main(String[] args) 
    {

        FlyingRobot f = new FlyingRobot("F001", 80);
        MovingRobot m = new MovingRobot("M001", 60);
        WalkingRobot w = new WalkingRobot("W001", 10);

        f.fly();
        m.drive();
        w.walk();

        f.move(50);
        m.move(30, "North");

        RobotController controller = new RobotController();

        controller.addRobot(f);
        controller.addRobot(m);
        controller.addRobot(w);

        System.out.println("\nStarting Robots:");
        controller.startAll();

        System.out.println("\nRobot Status:");
        controller.showAllStatus();

        System.out.println("\nStopping Robots:");
        controller.stopAll();
    }
}