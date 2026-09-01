package Arrays;
import java.util.*;
public class containsduplicate {
    public  static boolean duplicate(int[]num){
    for(int i=0;i<num.length-1;i++){
       for(int j=i+1;j<num.length;j++){
        if(num[i]==num[j]){
            return true;
        }
        
       }
    }
    return false;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        System.out.println("enter elements in an array:");
        int[]num=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println(duplicate(num));

    }
    }
    

