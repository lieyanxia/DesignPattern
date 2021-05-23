package singleton.type3;

public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/*
    懒汉式（线程不安全）
    优缺点分析:
    优点:起到了Lazy Loading的效果，但是只能在单线程下使用
    缺点：若在多线程下，一个进程进入了if（instance == null）判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这便会产生多个实例，
        所以多线程环境下不可使用这种方式

    结论：懒汉式（线程不安全）：在实际开发中，不能使用这种方式
 */
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
