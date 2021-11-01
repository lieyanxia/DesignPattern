package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.PepperPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType; //订购Pizza的类型
//        do {
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊");
//            }else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪");
//            }else if(orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒");
//            }
//            else{
//                break;
//            }
//            //输出pizza的制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while(true);
//    }

    //写一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入
        this.simpleFactory = simpleFactory;
        do{
            orderType = getType();
            //可以源源不断的生产Pizza
            Pizza pizza = simpleFactory.createPizza(orderType);
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
