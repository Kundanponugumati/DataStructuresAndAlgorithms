package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list,16));

    }

    public static boolean pairSum2(ArrayList<Integer> list , int targetSum)
    {
        // first find out breaking point where list(i)>list(i+1)
        int breakingPoint =0;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                breakingPoint=i;
            }
        }
        int i=breakingPoint+1;
        int j= breakingPoint;
        while (i!=j)
        {
            if(list.get(i)+ list.get(j) == targetSum) {
                System.out.println(list.get(i)+" "+list.get(j));
                return true;
            }
            else if(list.get(i)+ list.get(j)> targetSum)
                j=(list.size()+j-1)% list.size();
            else if(list.get(i)+ list.get(j)<targetSum )
                i=(i+1)% list.size();
            else
                return false;
        }
        return false;
    }
}
