package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        // swap numbers at indexes 1 & 3;
        int a = list.get(1);
        int b = list.get(3);
        int set = a;
        a=b;
        b = set;
        list.set(1,a);
        list.set(3,b);
        System.out.println(list);
        // for sorting we use direct method
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); // to get sort in reverse order i.e descending order
        System.out.println(list);
    }
}
