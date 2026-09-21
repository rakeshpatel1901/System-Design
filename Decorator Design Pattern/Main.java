import Decorator.MushroomDecorator;
import product.PaneerPizza;
import product.Pizza;

public class Main {
    public static void main(String args[]){
        Pizza pizza = new MushroomDecorator(new MushroomDecorator(new PaneerPizza()));
        System.out.println("Pizza Price : "+ pizza.getCost());
    }
}
