package prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneTarget deepCloneTarget;

    public DeepProtoType() {
        super();
    }

    //深拷贝  -方式1使用克隆方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep =null;
        //完成对基本数据类型和String的克隆
        deep = super.clone();
        //对引用类型的属性 进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneTarget = (DeepCloneTarget) deepCloneTarget.clone();
        return deepProtoType;
    }

    //深拷贝 --方式2使用对象的序列化实现（推荐）
    public Object deepClone(){

        //创建流对象 输出流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        //输入流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;


        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);  //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
