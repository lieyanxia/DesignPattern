package interfaceisolationblog;


/*

    方案一：
    I 是接口   B与D是接口I的实现
    A通过接口I依赖了B    所谓依赖即是在A的成员方法里 ，B类对象作为参数被传入
    C通过接口I依赖了D

    方案二：
    针对方案一   B与D类均是接口I的实现  但由于接口I过于臃肿  实现类都必须要实现接口I中的所有方法
    如果将这个设计修改为符合接口隔离原则，就必须要对接口I进行拆分
    针对方案一，将原有的接口I拆分成三个接口
 */
interface I1{
    public void method1();
}

interface I2{
    public void method2();
    public void method3();
}

interface I3{
    public void method4();
    public void method5();
}

class B_ implements I1,I2{

    @Override
    public void method1() {
        System.out.println("类B实现了接口I1的方法1");
    }

    @Override
    public void method2() {
        System.out.println("类B实现了接口I2的方法2");
    }

    @Override
    public void method3() {
        System.out.println("类B实现了接口I2的方法3");
    }
}

class D_ implements I1,I3{

    @Override
    public void method1() {
        System.out.println("类D实现了接口I1中的方法1");
    }

    @Override
    public void method4() {
        System.out.println("类D实现了接口I3的方法4");
    }

    @Override
    public void method5() {
        System.out.println("类D实现了接口I3的方法5");
    }
}

class A_ {
    public void depend1(I1 i){
        i.method1();
    }

    public void depend2(I2 i){
        i.method2();
    }

    public void depend3(I2 i){
        i.method3();
    }
}

class C_ {
    public void depend1(I1 i){
        i.method1();
    }
    public void depend2(I3 i){
        i.method4();
    }
    public void depend3(I3 i){
        i.method5();
    }
}


public class interfaceisolation2 {
    public static void main(String[] args) {
        A_ a = new A_();
        a.depend1(new B_());
        a.depend2(new B_());
        a.depend3(new B_());

        C_ c = new C_();
        c.depend1(new D_());
        c.depend2(new D_());
        c.depend3(new D_());
    }
}
