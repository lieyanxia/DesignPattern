package factory.abstractfactory.pizzastore.oder;

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
