package BitManipulation;
import java.util.*;
public class powerofTwo{
    public static boolean ispowerofTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main (String args[]){
        System.out.println(ispowerofTwo(15));
    }
}