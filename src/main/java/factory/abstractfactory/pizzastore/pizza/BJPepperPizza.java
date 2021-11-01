package factory.abstractfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒Pizza");
        System.out.println("给北京胡椒Pizza准备原材料");
    }
}
