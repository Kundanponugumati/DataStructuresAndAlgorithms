package ArrayList;

import java.util.ArrayList;

public class OperationInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(2,23);
        System.out.println(list);
        list.add(4,19);
        System.out.println(list);
        System.out.println(list.size());
    }
}
