package findduplicatenumber;
import java.util.*;

class Solution {
    public static int findDuplicate(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] dp = new int[max + 1];
        Arrays.fill(dp, 0);
        for (int i : nums) {
            if (dp[i] != 0) {
                return i;
                // break;
            }
            ++dp[i];

        }
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
}