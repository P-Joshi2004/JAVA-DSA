package Arrays;

public class kadanes {

    public static void maxSubArraySum(int[] num) {

        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for (int i = 0; i < num.length; i++) {

            CurrentSum = CurrentSum + num[i];

            MaxSum = Math.max(MaxSum, CurrentSum);

            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
        }

        System.out.println("Max sum of subarray is: " + MaxSum);
    }

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5};

        maxSubArraySum(num);
    }
}