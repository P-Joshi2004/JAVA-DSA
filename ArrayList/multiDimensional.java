package ArrayList;

import java.util.ArrayList;

public class multiDimensional {
    public static void main(String args[]){
      ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
      ArrayList<Integer>List1=new ArrayList<>();
      ArrayList<Integer>List2=new ArrayList<>();
      ArrayList<Integer>List3=new ArrayList<>();
      for(int i=1;i<=5;i++){
        List1.add(i*1);
        List2.add(i*2);
        List3.add(i*3);
      }
      System.out.println(List1);
      System.out.println(List2);
      System.out.println(List3);
    MainList.add(List1);
    MainList.add(List2);
    MainList.add(List3);
    System.out.print(MainList);
    }
    
}
