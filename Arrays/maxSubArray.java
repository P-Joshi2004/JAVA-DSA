package Arrays;

public class maxSubArray {
    public static void bruteforce(int []num){
         int totalSubArray=0;
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(num[k]+ " ");
                currentSum=currentSum+num[k];
            }
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
        
             System.out.println();
             totalSubArray++;
        }
    }
            System.out.println("total subarray are:"+totalSubArray);  
            System.out.println("you max sum from subarray is:"+maxSum);
           }
        
           public static void main(String args[]){
            int num[]={1,2,3,4,5};
            bruteforce(num);
           }
    }
    
