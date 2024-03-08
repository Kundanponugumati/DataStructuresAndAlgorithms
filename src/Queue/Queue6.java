package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// first non-repeating letter in a stream of characters
// eg:      a a b c c x b
//output:   a -1 b b b b x
public class Queue6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        nonRepeating(str);
    }
    public static void nonRepeating(String str)
    {
        int [] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();
        for(int i=0;i<str.length();i++)
        {
            Character ch = str.charAt(i);
            queue.add(ch);
            freq[ch-'a']++;
            while(!queue.isEmpty() && freq[queue.peek()-'a']>1)
            {
                queue.remove();
            }

            if(queue.isEmpty()) {
                System.out.print(-1+" ");
            }
            else {
                System.out.print(queue.peek()+" ");
            }
        }
            System.out.println();
    }
}
