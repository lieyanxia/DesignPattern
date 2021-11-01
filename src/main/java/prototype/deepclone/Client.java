package prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "宋江";
        deepProtoType.deepCloneTarget = new DeepCloneTarget("大牛","大牛的类");

        //方式1:完成深拷贝
//        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
//
//        System.out.println("deepProtype.name="+deepProtoType.name+"deepPrototype.deepCloneableTarget"+deepProtoType.deepCloneTarget.hashCode());
//        System.out.println("deepProtype1.name="+deepProtoType1.name+"deepPrototype1.deepCloneableTarget"+deepProtoType1.deepCloneTarget.hashCode());

        //方式2：完成深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println("deepProtype.name="+deepProtoType.name+"deepPrototype.deepCloneableTarget"+deepProtoType.deepCloneTarget.hashCode());
        System.out.println("deepProtype1.name="+deepProtoType1.name+"deepPrototype1.deepCloneableTarget"+deepProtoType1.deepCloneTarget.hashCode());


    }
}
