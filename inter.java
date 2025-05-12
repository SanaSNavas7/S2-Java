import java.util.Scanner;

interface Shape {
    public void area();

    public void perimeter();
}
 class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
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

    } class inter{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ch;
    while(true){
        
    System.out.println("Enter 1.Rectange /n 2.Circle \n 3.Exit");
    ch=sc.nextInt();
    switch(ch){
        case 1:
    System.out.println("Enter length: ");
    int l=sc.nextInt();
     System.out.println("Enter breadth: ");
    int b=sc.nextInt();
    Rectangle rect=new Rectangle(l,b);
    rect.area();
    rect.perimeter();
    break;
    case 2:
    System.out.println("Enter radius: ");
    int r=sc.nextInt();
     
    Circle c=new Circle(r);
    c.area();
    c.perimeter();
    break;
    case 3:
    System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice!");
}
    }
    }}