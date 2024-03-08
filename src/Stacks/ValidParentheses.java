package Stacks;
import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]}()))";
        System.out.println(validString(s));

    }
    public static boolean validString(String s)
    {
        // first let us create the stack of characters.
        Stack <Character>st = new Stack<>();
        char []arr = s.toCharArray();

        // to print char arr
//        for(char element : arr)
//        {
//            System.out.print(element+" ");
//        }
//        System.out.println();

        int i=0;
        while(i<arr.length)
        {
            if((arr[i]=='(') || (arr[i]=='{') || (arr[i]=='[') )
            {
                st.push(arr[i]);
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                if ((st.peek() == '(' && arr[i] == ')') || (st.peek() == '[' && arr[i] == ']') || (st.peek() == '{' && arr[i] == '}')) {

                    st.pop();
                }

                else {
                    return false;
                }
            }

            i++;
        }
        if(st.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }

    }
}
