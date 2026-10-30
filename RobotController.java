import java.util.ArrayList;

public class RobotController
{

    private ArrayList<Robot> robots = new ArrayList<>();

    public void addRobot(Robot robot)
    {
        robots.add(robot);
    }

    public void startAll() {
        for (Robot robot : robots) 
        {
            try {
                robot.start();
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void showAllStatus()
    {
        for (Robot robot : robots) 
        {
            robot.status();
        }
    }

    public void stopAll() 
    {
        for (Robot robot : robots) 
        {
            robot.stop();
        }
    }
}
