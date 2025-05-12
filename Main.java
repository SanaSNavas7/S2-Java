import java.util.Scanner;
class complex {
    int r;
    int i;
    complex(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real of num1: ");
        this.r=sc.nextInt();
        this.i=sc.nextInt();
    }
    void sum(complex c2){
        this.r=this.r+c2.r;
        this.i=this.i+c2.i;

    }
    void display(){
        System.out.println(this.r+"i"+"+"+this.i+"j");
    }
}
public class Main{  public static void main(String[] args) {
        complex c1=new complex();
        complex c2=new complex();
        c1.sum(c2);
        c1.display();
    }
}
