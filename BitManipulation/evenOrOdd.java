package BitManipulation;

public class evenOrOdd {
    public static void number(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        number(3);
        number(4);
    }
    
}
