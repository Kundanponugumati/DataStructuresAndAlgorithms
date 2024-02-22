package Stacks;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        // let define the array
        int [] arr = {3,7,2,9,4};
        // define the nextGreaterElement array
        int [] nxtArr = new int[arr.length];

        // this is brute force approach where time complexity is O(n^2)

//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i;j< arr.length;j++)
//            {
//                if(arr[i]<arr[j])
//                {
//                    nxtArr[i]=arr[j];
//                    break;
//                }
//                else if(j==arr.length-1)
//                {
//                    nxtArr[i]=-1;
//                }
//            }
//        }

        // to optimise time complexity we use stack for solving this problem.

        Stack <Integer> s = new Stack<>();

        for(int i= arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && arr[i]>=s.peek())
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxtArr[i]=-1;
            }
            else
            {
                nxtArr[i]= s.peek();
            }
            s.push(arr[i]);
        }
        for(int element : nxtArr)
        {
            System.out.print(element+" ");
        }
    }
}
