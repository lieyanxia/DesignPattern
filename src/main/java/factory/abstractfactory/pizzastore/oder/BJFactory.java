package factory.abstractfactory.pizzastore.oder;

import factory.abstractfactory.pizzastore.pizza.BJCheessPizza;
import factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import factory.abstractfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式...");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheessPizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
