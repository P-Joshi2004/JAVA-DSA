package Arrays;

public class subArray {
    public static int subelements(int []num){
        int totalSubArray=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(num[k]+ " ");
            }
             System.out.println();
             totalSubArray++;
        }
    }
            return totalSubArray;  
           }
            public static void main(String[] args){
                int num[]={1,2,3,4,5};
              int total=subelements(num);
              System.out.println("Total subarray are:"+total);
            }
        }



