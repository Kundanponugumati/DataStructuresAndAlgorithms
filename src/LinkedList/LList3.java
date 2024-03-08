package LinkedList;

// find and remove nth node from end.
public class LList3 {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public static Node head;
    public static Node tail;
    public  static int size=0;


    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // to remove nth from end which mean remove list.size - n ;
    public void remove(int index)
    {
        Node temp = head;
        if(size == index)
        {
            head = head.next;
        }
         index = size - index;
        int i=0;
        while(i< index-1)
        {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LList3 list = new LList3();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        list.remove(5);
        list.print();
    }
}
