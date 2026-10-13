package ArrayList;

import java.util.*;


public class sorting {
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(12);
        List.add(4);
        List.add(8);
        List.add(67);
        List.add(23);
        List.add(5);
        System.out.println(List);
        
        System.out.println("List After Sorting in asceneding order");
        Collections.sort(List);
        System.out.println(List);
        System.out.println("List After Sorting in descending order");
        Collections.sort(List,Collections.reverseOrder());
        System.out.println(List);
    }
    
}
