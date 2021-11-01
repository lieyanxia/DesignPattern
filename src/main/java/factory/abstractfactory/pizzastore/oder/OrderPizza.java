package factory.abstractfactory.pizzastore.oder;

import factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbstractFactory abstractFactory;

    //构造器
    public OrderPizza(AbstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }

    private void setAbstractFactory(AbstractFactory abstractFactory){
        Pizza pizza = null;
        String orderType = "";  //用户输入
        this.abstractFactory = abstractFactory;
        do{
            orderType = getType();
            //factory可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = abstractFactory.createPizza(orderType);
            if(pizza != null){ //订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
            }
        }while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Pizza Type:");
        String str = null;
        try {
            str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
