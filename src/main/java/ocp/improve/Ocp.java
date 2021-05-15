package ocp.improve;
/*
    该种方式 在新增一个图形类时  需要在使用方修改代码  违反了开闭原则（对使用方修改关闭）
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象
    public void drawShape(Shape s){
        s.draw();
    }
}


//图形的基类 Shape类
abstract class Shape{
    int m_type;
    public abstract void draw();
}
//矩形
class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
//圆形
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//三角形
class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增一个图形
class OtherGraphic extends Shape{
    OtherGraphic(){
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其它图形");
    }
}