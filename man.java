/*Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors
to initialize the data members. Create another class ‘Teacher’ that inherit the properties of class
employee and contain its own data members department, Subjects taught and constructors to
initialize these data members and also include display function to display all the data members.
Use array of objects to display details of N teachers.*/

import java.util.Scanner;

class emp {
    int Empid;
    String Name;
    String Address;
    Scanner sc = new Scanner(System.in);

    emp() {
        System.out.println("Enter employee id: ");
        Empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name: ");
        Name = sc.nextLine();
        System.out.println("Enter employee address");
        Address = sc.nextLine();

    }
}

    class Teacher extends emp {
        String dept;
        String[] subj;
        int n;

        Teacher() {
            super();
         
            System.out.println("Enter Teacher dept: ");
            dept = sc.nextLine();
               System.out.println("Enter no of subj: ");
         n = sc.nextInt();
            sc.nextLine();
              subj = new String[n];  
            System.out.println("Enter sujects taught: ");
            for (int i = 0; i < n; i++) {
                subj[i] = sc.nextLine();
            }
        
    
        }
    
        void display() {
            System.out.println("Teachers Details");
            System.out.println("Emp id: " + Empid);
            System.out.println("Name:" + Name);
            System.out.println("Address: " + Address);
            System.out.println("Department: " + dept);
            for (String sub : subj) {
                System.out.println("Subjects: " + sub);
            }
        }}
public class man{
        
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no teachers:");
            int m=sc.nextInt();
            Teacher[] t=new Teacher[m];
            for(int i=0;i<m;i++){
                t[i]=new Teacher();

            }
        for(int i=0;i<m;i++){

        
        t[i].display();}
        }
   
    }
    


    