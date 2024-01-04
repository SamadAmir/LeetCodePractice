import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,target);

    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i=0;i< nums.length;i++)
        {
            int temp = target - nums[i];
            if(map.containsKey(temp))
            {
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1};
    }
}