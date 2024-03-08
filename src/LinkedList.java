/*
// what is Linked List Head&Tail
1. addFirst
2.addLast
3.add anywhere
4.print
5.removeFirst
6.removeLast
7.removeAnywhere
8. size
9. iterative search
10. recursive search
11.reverse a linked list
12. remove nth node from end
13. check is palindrome.
 */

public class LinkedList {

    // what is linked list and head & tail
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
    public static int size;

    // add first
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add anywhere.
    public void add(int data, int index)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        if(index==0)
        {
         newNode.next = head;
         head = newNode;
         return;
        }
        int i=0;
        Node temp = head;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // print
    public void print()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
       int val = head.data;
       head = head.next;
       size--;
       return val;
    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int i=0;
        Node temp = head;
        while(i<size-2)
        {
            temp = temp.next;
            i++;
        }
        int val = tail.data;  // or  temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int removeAtIndex(int index)
    {
        if(head == null)
        {
            System.out.println("Linked List is empty");
            return -1;
        }
        if(index == size-1)
        {
            return removeLast();
        }
        int i=0;
        Node temp = head;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    //iterative search
    public boolean iterativeSearch(int data)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == data)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // recursiveSearch
    public int helper(Node head,int data)
    {
        if(head.data == data)
        {
            return 0;
        }
        if(head.next== null)
        {
            return -1;
        }
        head = head.next;
       int index =  helper(head,data);
       if(index ==-1)
       {
           return -1;
       }
       index = index+1;
       return index;
    }
    public int recursiveSearch(int data)
    {
        return helper(head ,data);
    }

    /*
11.reverse a linked list
12. remove nth node from end
13. check is palindrome.
*/
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.add(3,2);
        System.out.println("the linked list");
        list.print();
        System.out.println(list.recursiveSearch(11));
    }
}
