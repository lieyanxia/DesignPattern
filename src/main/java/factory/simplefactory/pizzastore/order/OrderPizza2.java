package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = null;
    //构造器
    public OrderPizza2(){
        do{
            orderType = getType();
            //可以源源不断的生产Pizza
            Pizza pizza = SimpleFactory.createPizza2(orderType);
            //输出Pizza
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购Pizza失败");
                break;
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
