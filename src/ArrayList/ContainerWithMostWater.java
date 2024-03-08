package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        /*
        This is brute force solution timeComplexity O(n^2)
        int max =0;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i;j<list.size();j++)
            {
                if(max<(j-i)*Math.min(list.get(i),list.get(j)))
                {
                    max = (j-i)*Math.min(list.get(i),list.get(j));
                }
            }
        }
        */

        // we use 2 pointer approach to solve in linear time.

        int i=0;
        int j = list.size()-1;
        int max =0;
        while(i<j)
        {
            int height = Math.min(list.get(i),list.get(j));
            int width = j-i;
            int area = height*width;
            max = Math.max(max,area);
            if(list.get(i)>list.get(j))
                j--;
            else
                i++;
        }

        System.out.println(max);

    }
}
