package Stacks;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String s = "((a+b))";
        System.out.println(checkDuplicate(s));
    }

    public static boolean checkDuplicate(String s) {

        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=')')
            {
                st.push(s.charAt(i));
            }

            else if(s.charAt(i)==')')
            {
                int count =0;
                while(!st.isEmpty() && st.peek()!='(')
                {
                    st.pop();
                    count++;
                }
                if(count<1)
                {
                    return true;
                }
                st.pop();
            }
        }
        return false;
    }
}
