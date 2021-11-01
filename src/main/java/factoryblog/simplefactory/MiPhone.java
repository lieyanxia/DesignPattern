package factoryblog.simplefactory;

public class MiPhone implements Phone{

    public MiPhone(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Make XiaoMI Phone!");
    }
}
