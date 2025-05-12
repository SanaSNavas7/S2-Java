
/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to
initialize the data members and another class ‘Employee’ that inherits the properties of class
Person and also contains its own data members like Empid, Company_name, Qualification,
Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of
class Employee and contains its own data members like Subject, Department, Teacherid and
also contain constructors and methods to display the data members. Use array of objects to
display details of N teachers*/
import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;
    Scanner sc = new Scanner(System.in);

    Person() {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter gender: ");
        gender = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();

    }}

class Employee extends Person{ 

int Empid;
String Company_name;
String qualification;
int salary;
Employee(){
    super();
    System.out.println("Enter empid: ");
Empid=sc.nextInt();
System.out.println("Enter company name: ");
Company_name=sc.nextLine();
System.out.println("Enter qualification: ");
qualification=sc.nextLine();
System.out.println("Enter salary: ");
salary=sc.nextInt();


}
}
 class Teacher extends Employee{
    String subject;
    String department;
    int teacherid;
    Teacher(int i){
        System.out.println("Enter subject:  ");
subject=sc.nextLine();
System.out.println("Enter department: ");
department=sc.nextLine();
System.out.println("Enter teacherid: ");
teacherid=sc.nextInt();
System.out.println("Enter subject: ");
subject=sc.nextLine();
    }
 
void display(int i){
System.out.println("\n\n\t\tTeacher "+" Details");
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Address: "+address);
System.out.println("Age: "+age);
System.out.println("Employee ID: "+Empid);
System.out.println("Teacher ID: "+name);
System.out.println("Company Name: "+Company_name);
System.out.println("Department: "+name);
System.out.println("Qualification: "+qualification);
System.out.println("Salary: "+salary);
System.out.println("Subject: "+subject);
}}
class multilevel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        Teacher t[]=new Teacher[n];
        for(int i=0;i<n;i++){
            t[i]=new Teacher(i+1);

            
        }
        for(int i=0;i<n;i++){
t[i].display(i+1);
}
    }
}


