package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stock ={100,80,60,70,60,85,100};
        int[] spanArr = new int[stock.length];
        StockSpan(stock,spanArr);
        for(int element : spanArr)
        {
            System.out.print(element+" ");
        }


    }

    private static void StockSpan(int [] stock,int [] spanArr)
    {
        Stack<Integer> s = new Stack<>();
        spanArr[0]=1;
        s.push(0);

        for(int i=1;i<stock.length;i++)
        {
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice>stock[s.peek()])
            {
             s.pop();
            }
            if(s.isEmpty())
            {
                spanArr[i]=i+1;
            }
            else {
                int prevHigh = s.peek();
                spanArr[i]= i-prevHigh;
            }
            s.push(i);
        }

    }
}
