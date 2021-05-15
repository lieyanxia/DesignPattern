package dependenceinversionprinciple;

public class dependenceinversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息： Hello World！";
    }
}

/*
   完成Person 接收消息的功能
   方式1分析如下：
   方式较常规，容易想到
   但如果我们获取的对象是微信，短信等等，则新增类，同时Person也需要增加响应的方法   不符合开闭原则
   解决思路：引入一个抽象的接口IReceiver,表示接受者   ，这样Person类与接口IReceiver发生依赖关系  person类依赖了IReceiver类
   因为Email,Weixin 等等均属于接收的范围   他们可以各自实现IReceiver接口类就OK，这样也就符合了依赖倒转原则
   即  细节依赖抽象 抽象不应该依赖细节。
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}









