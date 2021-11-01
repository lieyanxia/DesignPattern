package factory.factorymethod.pizzastore.pizza;

//将Pizza做成抽象类
public abstract class Pizza {
    protected String name; //Pizza的名字

    public abstract void prepare();

    public void bake(){   //pizza在烘焙
        System.out.println(name + " baking...");
    }

    public void cut(){   //pizza在切
        System.out.println(name + " cutting...");
    }

    public void box(){
        System.out.println(name + " boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
