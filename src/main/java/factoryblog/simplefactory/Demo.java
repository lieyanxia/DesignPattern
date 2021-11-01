package factoryblog.simplefactory;

public class Demo {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone miphone = factory.makePhone("Miphone");
        Phone iphone = factory.makePhone("iphone");
    }
}
