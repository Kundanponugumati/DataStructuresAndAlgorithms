package LinkedList;

// remove the cycle in linked list
public class LList6 {

    static class Node
    {
        int data ;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        LList6 list = new LList6();
        head = new LList6.Node(1);
        head.next = new LList6.Node(2);
        head.next.next = new LList6.Node(3);
        head.next.next.next= new LList6.Node(4);
        head.next.next.next.next = head.next;
        removeCycle(list);


    }

    public static void removeCycle(LList6 list) {
        // detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next!=null)
        {
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                cycle =true;
                break;
            }
        }
        Node prev = null;
        if(cycle== false)
        {
           return;
        }
        slow = head;
        while(slow!= fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;


        // find the meeting point and
        // make last node to null
    }
}
