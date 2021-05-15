package dependenceinversionprinciple;

public class DependencyPass {
    public static void main(String[] args) {
        //接口方式传递实现依赖
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(new ChangHong());
        //构造函数传递依赖
//        OpenAndClose openAndClose = new OpenAndClose(new ChangHong());
//        openAndClose.open();
        //setter方法传递依赖
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setter(new ChangHong());
        openAndClose.open();
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视机正在播放......");
    }
}

/*
    方式1：通过接口方式传递实现依赖
 */
//interface IOpenAndClose{
//    public void open(ITV tv);
//}
//interface ITV{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

/*
    方式2：通过构造方法传递依赖
 */
//interface IOpenAndClose{
//    public void open();
//}
//interface ITV{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//    private ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//    @Override
//    public void open() {
//        tv.play();
//    }
//}

/*
    方式3：通过setter方法传递

 */
interface IOpenAndClose{
    public void open();
    public void setter(ITV tv);
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    private ITV tv;

    @Override
    public void setter(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}
