import Factory.GuiFactory;
import Factory.WindowFactory;
import module.UiComponent;

public class Main {
    public static void main(String args[]){
        GuiFactory factory = new WindowFactory();
        UiComponent ui = factory.getInstance();
          ui.details();
    }
}
