package ArrayList;

import java.util.ArrayList;

public class containerWithMostWater2 {
    public static int waterStored(ArrayList<Integer>height){
        int maxWater=0;
        int leftPointer=0;
        int rightPointer=height.size()-1;
        while(leftPointer<rightPointer){
            //calculate water area
            int ht=Math.min(height.get(leftPointer),height.get(rightPointer));
            int width=rightPointer-leftPointer;
            int currWater=ht*width;
            maxWater=Math.max(maxWater, currWater);
        //update pointer.
        if(height.get(leftPointer)<height.get(rightPointer)){
            leftPointer++;
        }
        else{
            rightPointer--;
        }

        }
        return maxWater;
    }
    
    public static void main(String args[]){
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
       int result= waterStored(height);
       System.out.println("Container with maximum water stored is   "  +  result);
    
    }
}
