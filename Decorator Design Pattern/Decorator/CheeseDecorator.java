package Decorator;


import product.Pizza;

public class CheeseDecorator implements DecoratorInterface {
    Pizza pizza;
    public CheeseDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

}
