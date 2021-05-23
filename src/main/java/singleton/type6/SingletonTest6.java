package singleton.type6;

public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/*
    双重检查（必须还得加volatile）
    优缺点分析：
    优点：Double-check是多线程开发中常用的，进行了两次if(instance == null)检查  这样就可以保证线程安全了
        这样的话，后面再次访问，判断if（instance == null）直接return实例化对象，也避免反复进行方法同步
        线程安全；延迟加载；效率较高

    结论：双重检查，在实际开发中，推荐使用这种单例设计模式
 */
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
