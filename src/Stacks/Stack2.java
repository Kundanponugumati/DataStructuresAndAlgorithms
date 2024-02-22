package Stacks;
import java.util.*;
import java.util.Stack;

// implementation of stack using Collection Framework
public class Stack2 {

    static Stack <Integer> s = new Stack<>();
    // for performing actions
    static void actions()
    {
        s.push(23);
        System.out.println(s.pop());
//        System.out.println(s.peek());
    }

    public static void main(String[] args) {
        actions();
    }


}
