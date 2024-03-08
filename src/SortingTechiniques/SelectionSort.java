package SortingTechiniques;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        // before sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        selectionSort(arr);
        // after sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos =i;
            for(int j=i+1;j<arr.length;j++)
            {
             if(arr[minPos]>arr[j])
             {
                 minPos=j;
             }
            }
            // swapping
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
}
