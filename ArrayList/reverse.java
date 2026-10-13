package ArrayList;
import java.util.*;
public class reverse {
    public static void main(String args[]){
    ArrayList<Integer>List=new ArrayList<>();
    List.add(2);
    List.add(4);
    List.add(6);
    List.add(8);
    List.add(10);
    System.out.print(List);
    for(int i=List.size()-1;i>=0;i--){
        System.out.print(List.get(i)+" ");
    }
  

    } 
}
