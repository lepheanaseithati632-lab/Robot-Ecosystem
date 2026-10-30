  public abstract class BaseRobot implements Robot 
{

    protected String id;
    protected int batteryLevel;

    public BaseRobot(String id, int batteryLevel)
    {
        this.id = id;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() 
    {
        if (batteryLevel < 20) 
        {
            throw new IllegalStateException("Battery is too low!");
        }

        System.out.println(id + " has started.");
    }

    @Override
    public void stop() 
    {
        System.out.println(id + " has stopped.");
    }

    @Override
    public void status()
    {
        System.out.println("Robot ID: " + id);
        System.out.println("Battery: " + batteryLevel + "%");
    }

    // Method overloading
    public void move(int speed) {
        System.out.println(id + " moves at speed " + speed);
    }

    public void move(int speed, String direction)
    {
        System.out.println(id + " moves at speed "
                + speed + " towards " + direction);
    }
}
