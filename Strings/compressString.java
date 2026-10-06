package Strings;
import java.util.*;
public class compressString {
   

    public static String compress(String str) {

        String newstr = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 1;

            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }

            newstr += str.charAt(i);

            if (count > 1) {
                newstr += count;
            }
        }

        return newstr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Compressed string: " + compress(str));
    }
}