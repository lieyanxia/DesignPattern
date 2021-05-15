package demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}
//学院员工
class CollegeEmployee{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}
//管理学院员工的管理类
class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id= "+i);
            list.add(collegeEmployee);
        }
        return list;
    }
}

/*
    什么叫直接朋友：出现在成员变量、方法参数、方法返回值中的类为直接朋友，而出现在局部变量中的类不是直接的朋友
    陌生的类最好不要以局部变量的方式出现在类内部
    分析SchoolManager类的直接朋友有哪些 Employee、CollegeManager
    CollegeEmploye不是直接的朋友  是个陌生类 违背了迪米特原则
 */
//学校管理类
class SchoolManager{
    //返回学校总部的员工
    public List<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id= "+i);
            list.add(employee);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息
    void printAllEmployee(CollegeManager sub){

        //分析问题
        //1.这里的CollegeEmployee不是SchoolMananger的直接朋友，即是陌生类
        //2.它是以局部变量的形式出现在SchoolManager中
        //3.违反了迪米特原则

        //获取学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------学院员工-----------");
        for (CollegeEmployee e:list1) {
            System.out.println(e.getId());
        }
        //获取学校员工
        List<Employee> list2 = getAllEmployee();
        System.out.println("----------学校总部员工---------");
        for (Employee e:list2) {
            System.out.println(e.getId());
        }
    }
}