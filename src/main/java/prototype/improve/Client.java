package prototype.improve;

import prototype.improve.Sheep;
//父类引用子类对象 对象只能引用父类中的变量和方法（为什么会引用到子类  由于复写以及多态）
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack",2,"黑色");
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();

        //浅拷贝
        System.out.println(sheep+ "  sheep.friend"+sheep.friend.hashCode());
        System.out.println(sheep1+ "  sheep1.friend"+sheep1.friend.hashCode());
        System.out.println(sheep2+ "  sheep2.friend"+sheep2.friend.hashCode());
        System.out.println(sheep3+ "  sheep3.friend"+sheep3.friend.hashCode());
        System.out.println(sheep4+ "  sheep4.friend"+sheep4.friend.hashCode());
    }
}
