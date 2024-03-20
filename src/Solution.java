
import java.util.*;

 class Node {
 public int data;
 public Node next;

 Node()
 {
 this.data = 0;
 this.next = null;
 }

 Node(int data)
 {
 this.data = data;
 this.next = null;
 }

 Node(int data, Node next)
 {
 this.data = data;
 this.next = next;
 }
 };


public class Solution {
    public static Node head;
    public static Node tail;
    public static boolean isEmpty()
    {
        return head==null && tail==null;
    }
    public static Node constructLL(int []arr) {
        // Write your code here
        for(int i=0;i<arr.length;i++)
        {
            int data = arr[i];
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;

        }
        // to print the linkedlist
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        return head;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of the array
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        constructLL(arr);

    }
}