package singleton.type4;

public class SingletonTest4 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

/*
    懒汉式（线程安全 同步方法）
    优缺点分析:
    优点：解决了线程不安全的问题
    缺点：效率太低了，每个线程在想获得类的实例的时候，执行getInstance方法都要进行同步。而其实该方法只执行一次实例化代码就够了，
        后面的想获得该类实例，直接return就行了。方法进行同步效率太低。

    结论：懒汉式（线程安全 同步方法）：实际开发不推荐这种方式。
 */
class Singleton{
    private Singleton(){}

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
