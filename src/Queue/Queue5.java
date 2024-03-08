package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// stack using 2 queues
public class Queue5 {
    static class Stack
    {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }
        // push
        public static void push(int data)
        {
            if(!q1.isEmpty())
            {
                q1.add(data);
            }
            else
            {
                q2.add(data);
            }
        }

        // pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=-1;
            // case-1 elements stored q1
          if(!q1.isEmpty())
            {
               while(!q1.isEmpty())
               {
                   top = q1.remove();
                   if(q1.isEmpty())
                   {
                       break;
                   }
                   q2.add(top);
                }

            }
          // case-2 elements stored in q2
            else
          {
              while(!q2.isEmpty())
              {
                  top = q2.remove();
                  if(q2.isEmpty())
                  {
                      break;
                  }
                  q1.add(top);
              }
          }
          return top;
        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=-1;
            // case-1 elements stored q1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top = q1.remove();
                    q2.add(top);
                }

            }
            // case-2 elements stored in q2
            else
            {
                while(!q2.isEmpty())
                {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
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
            System.out.print(stack.pop()+" ");
        }

    }
}
