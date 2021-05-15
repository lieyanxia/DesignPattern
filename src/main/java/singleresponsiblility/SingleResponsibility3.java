package singleresponsiblility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

/*
    方式三：
    这种方式没有对原有类做较大修改  只是增加方法
    这里虽然没有在类级别上遵守单一职责原则 但是在方法级别上  仍然是遵守单一职责原则。
 */
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天空上运行");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle + "在海面上运行");
    }
}
