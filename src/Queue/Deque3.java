package Queue;

import java.util.Deque;
import java.util.LinkedList;

// queue using deque
public class Deque3 {

    static class Queue
    {
       static Deque<Integer> deque = new LinkedList<>();


       public static boolean isEmpty()
       {
           return deque.isEmpty();
       }
        // add
        public static void add(int data)
        {
            deque.addLast(data);
        }

        // remove
        public static int remove()
        {
            return deque.removeFirst();
        }

        // peek
        public static int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while(!queue.isEmpty())
        {
            System.out.print(queue.remove()+" ");
        }
    }
}
