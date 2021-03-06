package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒");
        }
        return pizza;
    }

    //简单工厂模式也叫静态工厂模式
    public static Pizza createPizza2(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒");
        }
        return pizza;
    }
}
