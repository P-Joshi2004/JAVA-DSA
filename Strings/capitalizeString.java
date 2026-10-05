import java.util.*;
public class capitalizeString {
    public static String  touppercase(String s){
        StringBuilder sb=new StringBuilder(s);
        if(s.length()>0){
            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        }
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i-1)==' '){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
                
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String s=sc.nextLine();
        String result= touppercase(s);
        System.out.println("output is:"+result);

        
    }
    
}
