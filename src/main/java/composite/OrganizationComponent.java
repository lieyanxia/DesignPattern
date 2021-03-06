package composite;

public abstract class OrganizationComponent {

    private String name;
    private String des;

    //增加
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    //删除
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();
}
