import java.util.*;
public class searchelement{
   public static boolean search(int matrix[][],int n,int m ,int key){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==key){
                System.out.println("Found at cell(" +i+ "," +j+ " )");
                return true;
            }

        }
    }
    System.out.println("Key not found");
    return false;
   }
   public static void main(String args[]){
    Scanner sc=new  Scanner(System.in);
    System.out.println("Enter number of rows");
    int n=sc.nextInt();
    System.out.println("Enter number of columns:");
    int m=sc.nextInt();
    System.out.println("Enter elements in an array:");
    int matrix[][]=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    //printing matrix
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+ " ");

        }
        System.out.println();
    }
    System.out.println("Enter key to search in matrix");
    int key=sc.nextInt();
    search(matrix,n, m,key);
   }
    
}
