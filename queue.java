import java.util.*;
public class que {
   public static void main(String[] args) {
    PriorityQueue <String> q=new PriorityQueue<String>();
    Scanner sc=new Scanner(System.in);
  String ele;
  int ch;
  while(true){
    System.out.println("enter 1.add /n 2.remove/n 3.peek /n 4.display /n 5.exit");
    ch=sc.nextInt();
    switch(ch){
    case 1:
    System.out.println("enter element : ");
    ele=sc.next();
    q.add(ele);
    break;
case 2:q.remove();
break;
case 3:System.out.println(q.peek());
break;
case 4:System.out.println(q);
break;
case 5:return;
default:
System.out.println("invalid");
    }
  }
   } 
}
