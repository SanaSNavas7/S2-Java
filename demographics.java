import Graphics.*;
import java.util.Scanner;
public class demographics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        int l=sc.nextInt();
 System.out.println("Enter breadth of rectangle: ");
        int b=sc.nextInt();
Rectangle re=new Rectangle(l,b);
re.area();
re.perimeter();
System.out.println("Enter radius: ");
int r=sc.nextInt();
Circle c=new Circle(r);
c.area();
c.perimeter();

    }
}
