package Module;

public class FourWheeler implements Vehicle{
    @Override
    public void start() {
        System.out.println("Four Wheeler Started");
    }

    @Override
    public void stop() {
        System.out.println("Four Wheeler Stopped");
    }
}
