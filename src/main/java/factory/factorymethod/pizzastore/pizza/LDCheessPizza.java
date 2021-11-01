package factory.factorymethod.pizzastore.pizza;

public class LDCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪Pizza");
        System.out.println("给伦敦奶酪Pizza准备原材料");
    }
}
