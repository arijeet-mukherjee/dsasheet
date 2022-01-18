package MaximumSubarray;

public class Solution {
    //static int maxSum = Integer.MIN_VALUE; 
    public static int maxSubArray(int[] nums) {
        if(nums.length < 1){
            System.out.println("cant accept null values\n error code :");
            return Integer.MIN_VALUE;
        }
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i], nums[i]+currentSum);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

}
