package singleton.type1;

public class SingletonType1{
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/*
    饿汉式（静态常量法）
    所谓饿汉式：就是提前加载
    步骤1：构造器私有化  （防止被new）
    步骤2：类的内部创建对象
    步骤3：向外暴露一个静态的公共方法  getInstance

    优缺点分析：
    优点:写法简单，在类装载时就完成了实例化，避免了线程同步问题。
    缺点：在类装载时就完成了实例化，没有达到Lazy Loading的效果。若从始至终没有使用这个实例，会造成内存的浪费。

    结论：
    饿汉式（静态常量法），该种单例模式可用，但可能会造成内存浪费
 */
class Singleton {

    private static Singleton instance = new Singleton();

     private Singleton(){
     }

     public static Singleton getInstance(){
         return instance;
     }
}
