
/*Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ
information and Search for an employee given eNo, using the concept of Array of Objects.*/
import java.util.*;

public class employee {
    int eNo;
    String eName;
    int eSalary;
    Scanner sc=new Scanner(System.in);

    employee() {
        System.out.println("Enter employee number: ");
        eNo = sc.nextInt();
        System.out.println("Enter employee ename: ");
        eName = sc.next();
        System.out.println("Enter employee salary: ");
        eSalary = sc.nextInt();

    }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("n: ");
    int n=sc.nextInt();

        System.out.println("enter n: ");

        employee e[] = new employee[n];
        for (int i = 0; i < n; i++) {
            e[i] = new employee();
        }
        System.out.println("enter employee no to search: ");
        int s = sc.nextInt();
        int flag=0;
    
        for (int i = 0; i < n; i++) {
            if (e[i].eNo == s) {
                
              System.out.println("eNo" + e[i].eNo + "Name:" + e[i].eName + "Salary" + e[i].eSalary);
                
            }}
        }
        
}
