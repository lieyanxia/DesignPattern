package composite;

import java.util.ArrayList;
import java.util.List;

//University就是component
public class University extends OrganizationComponent{

    //存放的是学院
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    //重写
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //重写
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print方法  输出university包含的学院
    @Override
    protected void print() {
        System.out.println("--------------"+getName()+"--------------");
        //遍历organizationComponents
        for (OrganizationComponent organizationComponent :organizationComponents) {
            organizationComponent.print();
        }
    }
}
