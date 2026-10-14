package ArrayList;

import java.util.ArrayList;

public class monotonic {

    public boolean isMonotonic(ArrayList<Integer> List) {
        boolean increase = true;
        boolean decrease = true;

        for (int i = 0; i < List.size() - 1; i++) {

            if (List.get(i) > List.get(i + 1)) {
                increase = false;
            }

            if (List.get(i) < List.get(i + 1)) {
                decrease = false;
            }
        }

        return increase || decrease;
    }

    public static void main(String args[]) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(2);
        List.add(2);
        List.add(3);

        monotonic obj = new monotonic();

        System.out.println(List);
        System.out.println(obj.isMonotonic(List));
    }
}