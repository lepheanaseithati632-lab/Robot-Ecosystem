public class WalkingRobot extends BaseRobot 
{

    public WalkingRobot(String id, int batteryLevel)
    {
        super(id, batteryLevel);
    }

    @Override
    public void status() 
    {
        System.out.println("Walking Robot: " + id);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    public void walk() 
    {
        System.out.println(id + " is walking.");
    }
}
