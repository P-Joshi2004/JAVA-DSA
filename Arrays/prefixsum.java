package Arrays;

public class prefixsum {
    public static void maxSubArraySum(int [] num){
        int currentSum=0;
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        //calculate prefix
    prefix[0]=num[0];
    for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+num[i];
    }
    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i;j<num.length;j++){
            int end=j;
            currentSum = start ==0?prefix[end]:prefix[end]-prefix[start-1];
            if(MaxSum<currentSum){
                MaxSum=currentSum;

            }
        }
    }
    System.out.println("maxsum of sub array is:"+MaxSum);
}
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        maxSubArraySum(num);
    }
    }
    

