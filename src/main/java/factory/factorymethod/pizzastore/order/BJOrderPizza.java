package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.BJCheessPizza;
import factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheessPizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
