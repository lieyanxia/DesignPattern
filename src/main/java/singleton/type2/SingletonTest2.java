package singleton.type2;

public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
/*
    饿汉式（静态代码块）
    跟静态常量法基本一致。
    优缺点跟静态常量法一致
    区别在于：将类的实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码快中的代码，初始化类的实例

    结论：饿汉式（静态代码块）单例模式可用，但是可能会造成内存浪费。
 */
class Singleton{
    private static Singleton instance;

    //静态代码块 创建实例对象
    static {
        instance = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

}
