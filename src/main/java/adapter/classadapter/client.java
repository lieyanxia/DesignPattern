package adapter.classadapter;

public class client {
    public static void main(String[] args) {
        System.out.println("=============类适配器模式===============");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter()); //适配的是电压 目标是电压 220V变成5V,手机只是使用者
    }
}
