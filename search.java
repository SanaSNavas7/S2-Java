import java.util.*;

public class search {
    int arr[];
    Scanner sc = new Scanner(System.in);
int n;
search(){

System.out.println("enter array size: ");
n=sc.nextInt();
arr=new int[n];
System.out.println("enter arry elements: ");
for(int i=0;i<n;i++){
    {
arr[i]=sc.nextInt();
    }
}}
void searchs(){
System.out.println("enter element to search: ");
int a=sc.nextInt();
int flag=0;
for(int i=0;i<n;i++){
if(arr[i]==a){
    flag=1;
    break;
}
}
if(flag==1){
    System.out.println("element found");
}else{
    System.out.println("not found");

}}
public static void main(String[] args){
    search s=new search();
    s.searchs();
}
}

