package factoryblog.abstractfactory;

import factoryblog.simplefactory.IPhone;
import factoryblog.simplefactory.Phone;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new MAC();
    }
}
