package ArrayList;
import java.util.*;
public class operations {
      public static void main(String args[]){
    ArrayList<Integer>List = new ArrayList<>();
  
    //add element time complexity o(1)
    List.add(15);
    List.add(27);
    List.add(21);
    List.add(24);
    List.add(23);
    List.add(5);
    System.out.println(List);
    //get element time complexity o(n)
    int element=List.get(3);
     System.out.println(element);
     //remove element time complexity o(n)
     List.remove(2);
     System.out.println(List);
     //set element time complexity o(n)
     List.set(3,28);
     System.out.println(List);
     //contains element time complexity o(n)
     System.out.println(List.contains(20));
     System.out.println(List.contains(15));
    }   
}
