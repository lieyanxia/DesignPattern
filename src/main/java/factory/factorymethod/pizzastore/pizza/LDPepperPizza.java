package factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒Pizza");
        System.out.println("给伦敦胡椒Pizza准备原材料");
    }
}
