package SortingTechiniques;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {
    public static void main(String[] args) {
        Integer[] arr = {5,4,1,3,2};
        // before sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        // after sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }
}
