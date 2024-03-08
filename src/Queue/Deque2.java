package Queue;

//stack using deque

import java.util.Deque;
import java.util.LinkedList;

public class Deque2 {
    public static class Stack
    {
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty() {
            return deque.isEmpty();
        }


        // push
        public static void push(int data)
        {
            deque.addLast(data);
        }

        // pop
        public static int pop()
        {
            if(deque.isEmpty())
                return -1;
            return deque.removeLast();
        }

        // peek
        public static int peek()
        {
            if(deque.isEmpty())
                return -1;
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+ " ");
        }
        System.out.println();


    }
}
