public class FlyingRobot extends BaseRobot 
{

    public FlyingRobot(String id, int batteryLevel)
    {
        super(id, batteryLevel);
    }

    @Override
    public void status() {
        System.out.println("Flying Robot: " + id);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    public void fly() 
    {
        System.out.println(id + " is flying.");
    }
}