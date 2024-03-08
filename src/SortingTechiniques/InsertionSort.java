package SortingTechiniques;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        // before sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        insertionSort(arr);
        // after sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++)
        {
            int curr =arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev]>curr)
            {
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1]=curr;
        }
    }
}
