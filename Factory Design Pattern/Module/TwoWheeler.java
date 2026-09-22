package Module;

public class TwoWheeler implements Vehicle{
    @Override
    public void start() {
        System.out.println("TwoWheeler Started");
    }

    @Override
    public void stop() {
        System.out.println("TwoWheeler Stopped");
    }
}
