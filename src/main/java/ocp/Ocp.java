package ocp;
/*
    该种方式 在新增一个图形类时  需要在使用方修改代码  违反了开闭原则（对使用方修改关闭）
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象  然后根据type值 ，来绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1)
            drawRectangle(s);
        else if(s.m_type == 2)
            drawCircle(s);
    }

    private void drawCircle(Shape s) {
        System.out.println("圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("矩形");
    }
}


//图形的基类 Shape类
class Shape{
    int m_type;
}
//矩形
class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}
//圆形
class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}