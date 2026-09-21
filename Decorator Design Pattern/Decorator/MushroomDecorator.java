package Decorator;

import product.Pizza;

public class MushroomDecorator implements DecoratorInterface {
    Pizza pizza;
    public MushroomDecorator(Pizza pizza){
        this.pizza = pizza;
    }


    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }

}
