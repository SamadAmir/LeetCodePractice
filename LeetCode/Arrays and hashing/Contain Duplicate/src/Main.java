import java.util.Set;
import java.util.HashSet;
class Main {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();
        boolean flag = false;
        for (int num:nums)
        {
            if(!set.add(num))
            {
                flag = true;
            }
        }
        return flag;
    }
}