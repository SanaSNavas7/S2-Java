import java.util.Scanner;
public class symm{
int m;
int n;
int matrix[][];
int trans[][];
symm(){
    Scanner sc=new Scanner(System.in);
    this.m=sc.nextInt();
    this.n=sc.nextInt();
matrix=new int[m][n];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        matrix[i][j]=sc.nextInt();
    }
}
}
void transpose(){
    trans=new int[n][m];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            trans[j][i]=matrix[i][j];
        }
    }
    boolean flag=true;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(trans[i][j]!=matrix[i][j]){
               flag=false;
                break;
            }
            
        }}
        if(flag==true){
            System.out.println("symmetric");
        }else{
            System.out.println("not symmetric");
        }
}
public static void main(String[] args) {
    symm m1=new symm();
 m1.transpose();
    
        
        }
    }

    
    
