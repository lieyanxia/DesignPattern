package interfaceisolationblog;

interface I{
    public void method1();
    public void method2();
    public void method3();
    public void method4();
    public void method5();
}

class B implements I{

    @Override
    public void method1() {
        System.out.println("类B实现接口I的方法1");
    }

    @Override
    public void method2() {
        System.out.println("类B实现接口I的方法2");
    }

    @Override
    public void method3() {
        System.out.println("类B实现接口I的方法3");
    }

    /*
        对于类B来说 method4和method5都不是必须的 但由于接口A中有这两个方法
        所以在实现过程中 即使这两个方法的方法体为空  也要将这两个没有作用的方法进行实现
     */
    @Override
    public void method4() { }
    @Override
    public void method5() { }
}


class A {
    public void depend1(I i){
        i.method1();
    }

    public void depend2(I i){
        i.method2();
    }

    public void depend3(I i){
        i.method3();
    }
}

class D implements I{

    @Override
    public void method1() {
        System.out.println("类D实现接口I的方法1");
    }

    /*
        对于类D来说 method2和method3都不是必须的 但由于接口A中有这两个方法
        所以在实现过程中 即使这两个方法的方法体为空  也要将这两个没有作用的方法进行实现
     */
    @Override
    public void method2() { }
    @Override
    public void method3() { }

    @Override
    public void method4() {
        System.out.println("类D实现接口I的方法4");
    }

    @Override
    public void method5() {
        System.out.println("类D实现接口I的方法5");
    }
}

class C {
    public void depend1(I i){
        i.method1();
    }

    public void depend2(I i){
        i.method4();
    }

    public void depend3(I i){
        i.method5();
    }
}
/*
    方案一：
    I 是接口   B与D是接口I的实现
    A通过接口I依赖了B    所谓依赖即是在A的成员方法里 ，B类对象作为参数被传入
    C通过接口I依赖了D
 */
public class interfaceisolation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());

    }
}
