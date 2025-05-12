import java.util.Scanner;
public class overload {
    void area(double r){
        System.out.println("Area of circle is: "+3.14*r*r);
    }
      void area(int l,int b){
        System.out.println("Area of rectangle is: "+l*b);
    }
      void area(int r){
        System.out.println("Area of square is: "+r*r);
    }
      void area(float length,float base){
        System.out.println("Area of triangle is: "+0.5*(length+base));
    }
    public static void main(String[] args) {
        overload o=new overload();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r=sc.nextDouble();
        o.area(r);
        System.out.println("Enter length of rectangle: ");
        int l=sc.nextInt();
          System.out.println("Enter breadth of rectangle: ");
        int b=sc.nextInt();
        o.area(l,b);
          System.out.println("Enter base of traingle: ");
        float base=sc.nextFloat();
          System.out.println("Enter length of triangle: ");
        float length=sc.nextFloat();
        o.area(length,base);

    }
}
