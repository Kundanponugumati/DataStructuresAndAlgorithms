package SortingTechiniques;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest,arr[i]);
        }
        // creation of countArray
        int [] countArr = new int[largest+1];
        // adding values to countArray
        for(int i=0;i< arr.length;i++)
        {
            countArr[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i< countArr.length;i++)
        {
            while (countArr[i] >0 )
            {
                arr[j]=i;
                j++;
                countArr[i]--;
            }
        }
    }
}
