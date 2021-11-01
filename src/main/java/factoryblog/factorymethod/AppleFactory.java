package factoryblog.factorymethod;

import factoryblog.simplefactory.IPhone;
import factoryblog.simplefactory.Phone;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
