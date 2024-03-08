package LinkedList;

// to reverse a LinkedList
public class LList2 {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
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
        if(temp == null)
        {
            System.out.println("Empty linked list");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
    }
    public void reverseLinkedList()
    {
        Node prev =  null;
        Node curr =tail =  head;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        LList2 list = new LList2();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        list.reverseLinkedList();
        list.print();
    }
}
