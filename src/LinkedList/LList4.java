package LinkedList;

// check whether the given linked list is a palindrome or not?
public class LList4 {

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
        if(head==null)
        {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("LinkedList is empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // find the middle node of the linked list
    // we use slow fast pointer.
    public Node findMidNode(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome()
    {

        // if linked list is empty or it has one node then it is abously palindrome
        if(head == null || head.next == null)
        {
            return true;
        }
        // find mid Node
        Node mid = findMidNode(head);

        // reverse 2nd half of the linked list

        Node prev = null;
        Node curr =mid;
        Node next;
        while(curr!= null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check 1st half is same as 2nd half.

        while(right!=null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LList4 list = new LList4();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.print();
        System.out.println(list.isPalindrome());
    }
}
