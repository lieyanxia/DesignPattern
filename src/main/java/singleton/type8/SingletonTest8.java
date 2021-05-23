package singleton.type8;

public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        instance.method();
    }
}

/*
    枚举方式
    优缺点：
    优点：这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
    这种方式是Effective Java作者Josh Bloch提倡的方式

    结论：枚举方式推荐使用。
 */
enum Singleton{
    INSTANCE;
    public void method(){
        System.out.println("OKay");
    }
}
