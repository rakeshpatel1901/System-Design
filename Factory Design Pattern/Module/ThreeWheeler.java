package Module;

public class ThreeWheeler implements Vehicle{
    @Override
    public void start() {
        System.out.println("ThreeWheeler Started");
    }

    @Override
    public void stop() {
        System.out.println("ThreeWheeler Stopped");
    }
}
