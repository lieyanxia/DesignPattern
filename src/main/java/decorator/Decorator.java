package decorator;

public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        //自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes() 输出被装饰者的信息  super也可以不需要
        return super.des + " " + super.getPrice() + " && " + obj.getDes();
    }
}
