package ArrayList;
import java.util.*;

public class maxelement {
    public static void main(String[] args ){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(23);
        List.add(22);
        List.add(2);
        List.add(13);
        List.add(53);
        System.out.print(List);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<List.size();i++){
            if(max<List.get(i)){
                max=List.get(i);
            }
        } 
            System.out.println("maximum element from the list is:"+ max);
        }
                            
    }
    

