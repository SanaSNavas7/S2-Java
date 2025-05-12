import java.util.Scanner;
class Product{
    int pcode;
    String pname;
    double price;
    void getdata(){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter product code");
this.pcode=sc.nextInt();
System.out.println("Enter product name");
this.pname=sc.next();
System.out.println("Enter product price");
this.price=sc.nextDouble();

    }
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        p1.getdata();
        p2.getdata();
        p3.getdata();
        if(p1.price<p2.price && p1.price<p3.price){
System.out.println("Product p1 has lowest price");
        }
        else if(p2.price<p1.price && p2.price<p3.price){
            System.out.println("Product p2 has lowest price");
        }
        else{
            System.out.println("Product p3 has lowest price");
        }

    }
}