package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // brute force
//        int targetSum = 5;
//        for(int i=0;i<list.size();i++)
//        {
//            for(int j=0;j<list.size();j++)
//            {
//                if(list.get(i)+list.get(j) == targetSum)
//                    System.out.println(list.get(i)+" "+list.get(j));
//            }
//        }
        int targetSum=11;

        System.out.println(pairSum(list,targetSum));

    }

    // 2-pointer approach
    public static boolean pairSum(ArrayList<Integer> list,int targetSum)
    {
        // 2 pointer approach
        int i=0;
        int j= list.size()-1;
        while(i<j)
        {
            if(list.get(i)+list.get(j) == targetSum)
            {
                return true;
            }
            else if(list.get(i) + list.get(j) >targetSum)
            {
                j--;
            }
            else if(list.get(i) + list.get(j) < targetSum)
                i++;
            else
                return false;
        }

        return false;
    }
}
