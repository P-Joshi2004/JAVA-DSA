package ArrayList;
import java.util.*;

public class pairSum {
    public static boolean sumofpair(ArrayList<Integer>List,int target){
        int n=List.size();
        int bp=-1;
        for(int i=0;i<List.size();i++){
            if(List.get(i)>List.get(i+1)){
                bp=i;
                break;

            }

        }
        int lp=bp+1;//smallest
        int rp=bp;//largest
        while(lp!=rp){
            //case1
            if(List.get(lp)+List.get(rp)==target){
                return true;
            }
            //case2
            if(List.get(lp)+List.get(rp)<target){
                lp=(lp+1)%n;
            }
            //case3
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);
     System.out.println(List);
    System.out.println(sumofpair(List, 16));
    }
    
}
