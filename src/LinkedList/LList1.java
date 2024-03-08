package LinkedList;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LList1 {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public static Node head; // object of Node class
    public static Node tail; // object of Node class
    public static int size =0;

    public void addFirst(int data)
    {
        // creating newNode
        Node newNode = new Node(data);

        // if linkedlist is empty then we make newNode as both head and tail.
        if(head==null)
        {
            head = tail = newNode;
            return;
        }

        // adding link between newNode and head node
        newNode.next = head;

        // making newNode as head node
        head = newNode;
    }

    public void addLast(int data)
    {
        // create newNode
        Node newNode = new Node(data);
        // if Linkedlist is empty then
        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        // make link between newNode and tail node
        tail.next = newNode;
        // making newNode as tail node.
        tail = newNode;
    }

    public void print()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("LinkedList is null");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addAtIndex(int data , int index)
    {
        Node temp = head;
        Node newNode = new Node(data);

        if(index==0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
       int i =0;
       while(i<index-1)
       {
           temp= temp.next;
           i++;
       }
       newNode.next = temp.next;
       temp.next = newNode;
    }

    public void size()
    {
        Node temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        System.out.println(size);
    }

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LinkedList is empty");
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
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size==1)
        {
         int val = head.data;
         head = tail = null;
         return val;
        }
        // to remove last
        int index = size-2;
        int i=0;
        Node temp = head;
        while(i<index)
        {
         temp = temp.next;
         i++;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int iterativeSearch(int key)
    {
        Node temp = head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int recursiveSearch(int key)
    {
        return helper(head,key);
    }
    public int helper(Node head , int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data == key)
        {
            return 0;
        }
        int index = helper(head.next,key);
        if(index==-1)
            return -1;
        return index+1;
    }
    public static void main(String[] args) {
        LList1 list = new LList1();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.print();
        list.addAtIndex(9,0);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.iterativeSearch(10));
        System.out.println(list.recursiveSearch(3));
    }
}
