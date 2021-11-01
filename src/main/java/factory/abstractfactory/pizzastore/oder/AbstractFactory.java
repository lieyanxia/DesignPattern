package factory.abstractfactory.pizzastore.oder;

import factory.abstractfactory.pizzastore.pizza.Pizza;

//一个抽象工厂模式的抽象层（接口）
public interface AbstractFactory {
    //让下面的工厂类来具体实现
    public Pizza createPizza(String orderType);
}
