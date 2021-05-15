package liskov;

public class liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        System.out.println("----------------------------");
        B b = new B();
        //原本是要计算11减3的 因为B继承了A 有实现减去功能的func1方法，但是B中无意识的重写了func1方法（）违反了里式替换原则，故导致最后加法的结果
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

class A {
    //返回两个数的差
    public int func1(int num1 , int num2){
        return num1-num2;
    }
}

//B 继承了A
//在A的基础上新增功能 先完成两数相加 之后再加9
class B extends A{

    //这里无意识的重写了A类的方法
    public int func1(int a ,int b){
        return a+b;
    }

    public int func2(int a ,int b){
        return func1(a,b)+9;
    }
}
