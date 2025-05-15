import java.util.*;

class prod {
    int n;
    int price;
    int pcode;
    String pname;
    
prod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        n = sc.nextInt();

        System.out.println("enter pcode : ");
        pcode = sc.nextInt();

        System.out.println("enter pname");
        pname = sc.next();
        System.out.println("enter price: ");
        price = sc.nextInt();
}
   static void lowest(ArrayList<prod> list) {
        int index = 0;
        int low = list.get(0).price;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).price < low) {
                low = list.get(i).price;
                index = i;
            }
        }
        System.out.println(list.get(index).pname);
    }

    public static void main(String[] args) {
        ArrayList<prod> list = new ArrayList<prod>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("n");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            prod p = new prod();
            list.add(p);
        }
        lowest(list);
    }
}
