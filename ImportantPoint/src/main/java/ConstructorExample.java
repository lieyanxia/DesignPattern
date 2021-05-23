public class ConstructorExample {
    public static void main(String[] args) {
        Bar bar = new Bar();
        System.out.println(bar.getValue());
    }
}

class Foo{  //父类
    int i = 1; //实例变量

    Foo(){  //父类构造方法
        System.out.println(i);
        int x = getValue();
        System.out.println(x);
    }

    {//实例代码块
        i = 2;
    }
    protected int getValue(){
        return i;
    }
}

class Bar extends Foo{  //子类
    int j = 1;

    Bar(){  //子类构造函数
        j = 2;
    }

    {//实例代码块
        j = 3;
    }

    @Override
    protected int getValue() {
        return j;
    }
}
/*
    2
    2
    2

    正确答案是
    2
    0
    2
    之后再仔细思考 见第二篇博文：类的初始化与实例化的讲解
 */
