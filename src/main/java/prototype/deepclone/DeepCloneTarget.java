package prototype.deepclone;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //该类的属性都是String 都能克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
