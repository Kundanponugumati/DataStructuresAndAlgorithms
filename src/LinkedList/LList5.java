package LinkedList;

import java.util.LinkedList;

// Detecting loop in a linked list
// using slow - fast approach or floyd's cycle finding algorithm
public class LList5 {

    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public static boolean isEmpty()
    {
        return head == null && tail == null;
    }

    public static void add(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = tail =  newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args) {
        LList5 list = new LList5();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        if(isCycleExist(list))
            System.out.println("Cycle exist");
        else
            System.out.println("No cycle found");
    }


    public static boolean isCycleExist(LList5 list) {
         Node slow = head;
         Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}
