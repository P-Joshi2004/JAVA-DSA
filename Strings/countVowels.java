package Strings;

import java.util.*;

public class countVowels {

    public static int vowelscount(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        System.out.println(vowelscount(word));

      
    }
}