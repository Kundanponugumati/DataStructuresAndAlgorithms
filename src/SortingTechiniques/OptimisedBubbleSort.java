package SortingTechiniques;
public class OptimisedBubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // before sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        int noOfSwaps = bubbleSort(arr);
        System.out.println("No.of Swaps took place : "+noOfSwaps);


        // after sorting
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }

    public static int bubbleSort(int[] arr) {
        int noOfSwaps=0;
        for(int turn = 0;turn<arr.length-1;turn++)
        {
            boolean flag = false;
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // swapping took place.
                    flag = true; // making falg true before each swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    noOfSwaps++;
                }
            }
            if(!flag)
            {
                return noOfSwaps ;
            }
        }

        return noOfSwaps;
    }
}

