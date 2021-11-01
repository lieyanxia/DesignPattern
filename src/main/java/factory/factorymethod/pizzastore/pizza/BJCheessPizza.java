package factory.factorymethod.pizzastore.pizza;

public class BJCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪Pizza");
        System.out.println("给北京奶酪Pizza准备原材料");
    }
}
