package FindNextPermutation;

public class Solution {

    public static void nextPermutation(int[] nums) {

        int pivotX = -1;
        int pivotY = -1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivotX = i;
                break;
            }
        }

        if (pivotX != -1) {

            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[pivotX] < nums[i]) {
                    pivotY = i;
                    break;
                }
            }

            //System.out.println(pivotX + "\n" + pivotY + "\n......");
            // swap the value at index pivotX and pivotY

            int tmp = nums[pivotX];
            nums[pivotX] = nums[pivotY];
            nums[pivotY] = tmp;

            reverse(nums, pivotX + 1, nums.length - 1);

        }

        else
            reverse(nums, 0, nums.length - 1);

    }


    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        nextPermutation(new int[] { 1, 2, 3 });
       // reverse(new int[] { 1, 2, 3 }, 1, 2);
    }
    
}
