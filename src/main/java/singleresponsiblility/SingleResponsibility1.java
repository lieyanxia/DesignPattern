package singleresponsiblility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

//交通工具类
//方式一
//该方式中违反了类的单一职责原则
//解决方案就是：根据交通工具类的不同 分解成不同的类即可。
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行...");
    }
}
