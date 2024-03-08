package Queue;

import java.util.LinkedList;
import java.util.*;

// interleave of queue
public class Queue7 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<9;i++)
        {
            q.add(i);
        }

        int n = q.size();
        // as n is even
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<n/2;i++)
        {
            q2.add(q.remove());
        }

        // now interleave
        while(!q2.isEmpty())
        {
            q.add(q2.remove());
            q.add(q.remove());
        }

        for(Integer num: q)
        {
            System.out.print(num+" ");
        }
    }
}
