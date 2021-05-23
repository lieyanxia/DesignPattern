package singleton.type5;

public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/*
    懒汉式（线程安全 同步代码块）
    优缺点：
    优点：本意是对第四种方式的改进，因为同步方法效率太低，改为同步产生实例化的代码块
    缺点：但是这种同步并不能起到线程同步的作用。跟第三种方式一样，还是会产生多个实例

    结论：懒汉式（线程安全，同步代码块）实际开发中，不能使用该方式
 */
class Singleton{
    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
