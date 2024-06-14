import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            List<Integer>list = new ArrayList<>();
            list.add(1);
            int res = 1;
            for(int j = 1; j < i; j++){
                res = res * (i-j);
                res = res/j;
                list.add(res);
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5;
        List<List<Integer>> pascalTriangle = solution.generate(numRows);

        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
