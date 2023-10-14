abstract class Shape{
    abstract double calculate();
    abstract void display();
}
class Rectangle extends Shape{
    private double length,breadth;
    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double calculate(){
        return length*breadth;
    }
    void display(){
        System.out.println("Area of rectangle = "+calculate());
    }
}
class Triangle extends Shape{
    private double base,height;
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double calculate(){
        return 0.5*base*height;
    }
    void display(){
        System.out.println("Area of triangle = "+calculate());
    }
}
public class Shape_demo {
    public static void main(String[] args){
        Rectangle r = new Rectangle(5,2);
        r.display();
        Triangle t = new Triangle(2,4);
        t.display();
    }
}
