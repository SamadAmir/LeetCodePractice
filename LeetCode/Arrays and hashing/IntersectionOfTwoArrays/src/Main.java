import java.util.*;

public class Main {
    public static void IntersectioOfTwoArrays(int[]arr1,int[]arr2)
    {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++)// set  = {7,3,9}
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i])) //{7,3,9} compares with -> {6,3,9,2,9,4}
            {                         // {3,9} matches increment count variable
                count++;
                set.remove(arr2[i]);
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        IntersectioOfTwoArrays(arr1,arr2);
    }
}