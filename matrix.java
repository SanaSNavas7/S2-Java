import java.util.Scanner;

public class matrix {
    int m;
    int n;
    int matrix[][];

    matrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        m=sc.nextInt();
        System.out.println("enter no of columns");
        n=sc.nextInt();
        matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
matrix[i][j]=sc.nextInt();

            } 
        }

    }

    void add(matrix m2){
        if(this.m!=m2.m || this.n!=m2.n){
            System.out.println("error");
        }
        else{
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
    matrix[i][j]+=m2.matrix[i][j];
    
                } 
            }
    
        }}
        void display(){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j <n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
        }
        public static void main(String args[]){
            matrix m1=new matrix();
            matrix m2=new matrix();
            m1.add(m2);
            m1.display();
            
           
        }  
        
    }

