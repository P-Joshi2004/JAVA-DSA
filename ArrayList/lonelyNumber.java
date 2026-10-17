
package ArrayList;

import java.util.ArrayList;

public class lonelyNumber {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {

            int num = nums.get(i);
            int count = 0;

        
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j).equals(num)) {
                    count++;
                }
            }

       
            if (count == 1 &&
                !nums.contains(num - 1) &&
                !nums.contains(num + 1)) {

                ans.add(num);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(findLonely(nums));
    }
}
