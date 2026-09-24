package Arrays;

public class pairsOfArray {
    public static int elementpairs(int[] num){
        int current=0;
        int totalPairElements=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                totalPairElements++;
                System.out.print("(" +num[i]+ ","+num[j]+ ")");
            }  
        }
        System.out.println();
        return totalPairElements;
    }

        public static void main(String[] args){
            int num[]={1,2,3,4,5};
             int total=elementpairs(num);
            System.out.println("Total pairs in an array are:"+ total);

        }
    }
    