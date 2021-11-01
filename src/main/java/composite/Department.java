package composite;

public class Department extends OrganizationComponent{

    @Override
    protected void print() {
        System.out.println(getName());
    }

    //add、remove不用再写了

    public Department(String name, String des) {
        super(name, des);
    }


}
