package factory.factorymethod.pizzastore.order;


import factory.factorymethod.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法  createPizza ,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购Pizza的类型
        do{
            orderType = getType();
            pizza = createPizza(orderType);  //抽象方法 由工厂子类实现
            //输出Pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
