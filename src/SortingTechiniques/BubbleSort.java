package SortingTechiniques;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        // before sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        bubbleSort(arr);
        // after sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int noOfSwaps=0;
        for(int turn = 0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // swapping took place.
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    noOfSwaps++;
                }
            }
        }
        System.out.println("No.of Swaps took place : "+noOfSwaps);
    }
}
