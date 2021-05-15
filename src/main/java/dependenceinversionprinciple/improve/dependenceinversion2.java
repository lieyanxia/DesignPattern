package dependenceinversionprinciple.improve;

import java.sql.SQLOutput;

public class dependenceinversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件：Hello World！";
    }
}

class Weixin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信 ： Hello World!";
    }
}

class Person {
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

