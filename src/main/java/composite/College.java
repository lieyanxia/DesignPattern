package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    //存放的是专业
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
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
