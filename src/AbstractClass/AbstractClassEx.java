package AbstractClass;

abstract class Shape{
    float h, w, radius;
    abstract float area();
}
class Triangle extends Shape{
    Triangle(float d1, float d2){
        h = d1;
        w = d2;
    }
    float area(){
        System.out.print("Area of Triangle is: ");
        return (h*w)/2;
    }
}
class Rectangle extends Shape{
    Rectangle(float d1, float d2){
        h = d1;
        w = d2;
    }
    float area(){
        System.out.print("Area of Rectangle is: ");
        return (h*w)/2;
    }
}
class Circle extends Shape{
    Circle(float d1){
        radius = d1;
    }
    float area(){
        System.out.print("Area of Circle is: ");
        return 3.14f * radius * radius;
    }
}

public class AbstractClassEx {
    public static void main(String[] args){
        Triangle t = new Triangle(4.3f,5.3f);
        Rectangle r = new Rectangle(2.4f,4.2f);
        Circle c = new Circle(10.5f);

        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());
    }
}
