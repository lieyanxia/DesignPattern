package Humburger;

//装饰者  配料的基类   用来对汉堡进行装饰 每层装饰增加一层配料  相当于Decorator
public abstract class Condiment extends Humburger {

    public abstract String getName();

}
