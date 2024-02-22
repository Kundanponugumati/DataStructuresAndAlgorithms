package Stacks;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        /* s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s); // to print the stack
        Stack<Integer> s2 = new Stack<>();
        while(!s.isEmpty())
        {
            int data = s.pop();
            s2.push(data);
        }
        System.out.println(s2); //the stack is reversed.
         */
        // here extra space is being used by creating new Stack.

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }

    private static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    private static void pushAtBottom(Stack<Integer> s,int data) {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
}
