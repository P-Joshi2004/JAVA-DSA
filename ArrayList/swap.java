package ArrayList;
import java.util.*;

public class swap {
    public static void swapElements(ArrayList<Integer>List,int index1,int index2){
        int temp=List.get(index1);
        List.set(index1,List.get(index2));
        List.set(index2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(24);
        List.add(42);
        List.add(56);
        List.add(78);
        List.add(89);
        List.add(99);
        System.out.println(List);
         swapElements(List, 3, 2);
      
        System.out.println("List after swapping elements");
        System.out.print(List);
    }
    
}
