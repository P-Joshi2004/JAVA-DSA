package BitManipulation;
import java.util.*;
public class basics {
    //AND && Operator
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println((a&b));
        //OR | Operator
        System.out.println((a|b));
        // XOR ^ Operator
        System.out.println((a^b));
        //1s complement of a
        System.out.println((~a));
        //1s complement of b
         System.out.println((~b));

    }
    
}
