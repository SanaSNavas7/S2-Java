package Graphics;



interface Shape {
    public void area();

    public void perimeter();
}
 class Rectangle implements Shape {

     int length, breadth;
    Rectangle(int l, int b) {
   
        length = l;
        breadth = b;
    }

    public void area() {
        System.out.println("Area of rectangle is: " + (length * breadth));
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle is: " + 2 * (length + breadth));
    }
}
class Circle implements Shape {
 int radius;
    Circle(int r) {
       
        radius = r;
    }

    public void area() {
        System.out.println("Area of circle is: " + 3.14 * radius * radius);
    }

    public void perimeter() {
        System.out.println("Perimeter of cirle is: " + 2 * 3.14 * radius);
    }

    } 
    
public class Triangle implements Shape
{
double breadth;
double height;
public Triangle(double b,double h)
{
height=h;
breadth=b;
}
public void area()
{
System.out.println("Area of Triangle: " + String.format("%.2f" ,(0.5*height*breadth)));
}
public void perimeter()
{
System.out.println("perimeter of Triangle: " + String.format("%.2f" ,(height+breadth)));
}
}
