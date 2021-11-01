package factory.abstractfactory.pizzastore.oder;

import factory.abstractfactory.pizzastore.pizza.*;

public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式...");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheessPizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
