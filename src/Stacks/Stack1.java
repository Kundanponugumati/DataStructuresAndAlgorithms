package Stacks;

// implementation of stack using Arraylist

import java.util.ArrayList;

class Stack
{
    static ArrayList <Integer> list = new ArrayList<Integer>();
    // here we define 3 methods
    //  1. push operation
//      2. pop operation
//      3. peek operation

    // push operation
    static void push(int data)
    {
        list.add(data);
    }

    // pop operation
    static int pop()
    {
        if(list.isEmpty())
        {
            return -1;
        }
        int element = list.get(list.size()-1);
        list.remove(list.size()-1);
        return element;
    }

    // peek operation
    static int peek()
    {
        if(list.isEmpty())
        {
            return -1;
        }
        return  list.get(list.size()-1);
    }


    // to check whether the stack is empty or not.
    public static boolean isEmpty() {
        return list.size()==0;
    }
}
public class Stack1 {
    public static void main(String[] args)
    {
        Stack.push(23);
        Stack.push(34);
        Stack.push(43);

        while(!Stack.isEmpty())
        {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
