package singleton.type7;

public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}
/*
    静态内部类方式
    优缺点分析：
    优点：这种方式采用了类装载机制来保证初始化实例时 只有一个线程。静态内部类方式在Singleton类被装载时并不会立马被实例化
        调用getInstance方法，才会装载SingletonINstance类，从而完成Singleton的实例化
        类的静态属性只会在第一次加载类的时候进行初始化，所以在这里JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的
        避免了线程不安全，利用静态内部类特点实现延迟加载，效率高

    结论：静态内部类方式推荐使用。
 */
class Singleton{
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
