public class MovingRobot extends BaseRobot 
{

    public MovingRobot(String id, int batteryLevel) 
    {
        super(id, batteryLevel);
    }

    @Override
    public void status()
    {
        System.out.println("Moving Robot: " + id);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    public void drive() 
    {
        System.out.println(id + " is driving on wheels.");
    }
}
