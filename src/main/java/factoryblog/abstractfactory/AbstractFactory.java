package factoryblog.abstractfactory;

import factoryblog.simplefactory.Phone;

public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
