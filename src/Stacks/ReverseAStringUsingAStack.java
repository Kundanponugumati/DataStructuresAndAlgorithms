package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseAStringUsingAStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            s.push(str.charAt(i));
        }
        StringBuilder str2 = new StringBuilder();
        while(!s.isEmpty())
        {
            str2.append(s.pop());
        }
        System.out.println(str2);
    }

}
