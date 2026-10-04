package Strings;
import java.util.*;
public class largestString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of strings:");
         int n=sc.nextInt();
         sc.nextLine();
     
      
            System.out.println("Enter your string to find largest string");
                 String largest=sc.nextLine();
               for(int i=1;i<n;i++){
                String str=sc.nextLine();
           
                  if(largest.compareTo(str)<0){
                    largest=str;
                  }
                  }
                   System.out.println("Largest String;"+ largest);

         }

      
    }
    
