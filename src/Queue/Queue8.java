package Queue;

import java.util.*;

// queue reversal
public class Queue8 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty()) {
            stack.add(q.remove());
        }
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for(Integer num: q)
        {
            System.out.print(num+" ");
        }
    }
}
