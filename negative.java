import java.util.*;

class negative extends RuntimeException {

    negative(String s) {
        super(s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
       int n=sc.nextInt();
        int arr[];
        int sum=0;
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            try{
if(arr[i]<0){
     throw new negative("negative not allowed");
            }

    else{
        sum+=arr[i];
    }}
    catch(negative e){
        System.out.println(e.getMessage());
        System.exit(0);
    }
}
System.out.println(sum/n);
    }
}
