package factoryblog.factorymethod;

public class Demo {
    public static void main(String[] args) {
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        AppleFactory appleFactory = new AppleFactory();
        xiaoMiFactory.makePhone();
        appleFactory.makePhone();
    }
}
