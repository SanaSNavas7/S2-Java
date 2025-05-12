import java.util.*;
public class sort {
    String s[];
    int n;
    Scanner sc = new Scanner(System.in);

    sort() {
        System.out.println("enter no of strings: ");
        n = sc.nextInt();
          sc.nextLine();
        s = new String[n];
        System.out.println("enter strings: ");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
    }

    void sorting(){
for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        if(s[j].compareTo(s[j+1])>0){
            String temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
        }
    }
}
    }
void display(){
    for(int i=0;i<n;i++){
        System.out.println(s[i]);
    }

    
}
public static void main(String[] args){
    sort s1=new sort();
    System.out.println("original string");
    s1.display();
    System.out.println("after sorting:");
    s1.sorting();
    s1.display();
}
}    

