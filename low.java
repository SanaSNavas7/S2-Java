import java.util.*;

class products {
    int pcode;
    String pname;
    int price;
    Scanner sc = new Scanner(System.in);
    int n;

    products() {
        System.out.println("enter pcode: ");
        pcode = sc.nextInt();
        System.out.println("enter pname");
        pname = sc.next();
        System.out.println("enter price: ");
        price = sc.nextInt();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        products p[] = new products[n];
        for (int i = 0; i < n; i++) {
            p[i] = new products();

        }
        int lowest = p[0].price;
        int index=0;
        for (int i = 1; i < n; i++) {
            if (p[i].price < lowest) {
                lowest = p[i].price;
                index=i;
            }

        }
        System.out.println("Lowest price is for " + p[index].pname + "price: " + p[index].price);
    }
}
