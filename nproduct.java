import java.util.Scanner;

public class low {
   low p[];
    int pno;
    String pname;
    int price;
    Scanner sc = new Scanner(System.in);

    low(int n) {

        System.out.println("Enter product code");
        pno = sc.nextInt();
        System.out.println("Enter product name");
        pname = sc.next();
        System.out.println("Enter product price");
        price = sc.nextInt();

    }
    void lowfin(low p[],int n){
    int index=0;
    int min=p[0].price;
    for(int i=0;i<n;i++){
        if(p[i].price<min){
            min=p[i].price;
            index=i;
        }
    }
    System.out.println("min is for: "+p[index].price);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter no of products: ");
        n = sc.nextInt();
        low p[] = new low[n];
        for (int i = 0; i < n; i++) {
            p[i] = new low(i + 1);

        }

    
   p[0].lowfin(p,n);
}}
