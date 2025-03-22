package RunningSumOf1dArray_1480;

import java.util.Arrays;

/*
* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
* */

class Solution {
    public static int[] runningSum(int[] nums) {

       /* int arrayLength = nums.length;
        int[] sumOfNums = new int[arrayLength];
        if(arrayLength >=1 && arrayLength <= 1000) {
            int arrayIndex = 0;
            int sum = 0;
            while (arrayLength > 0) {
                if(nums[arrayIndex] <= Math.pow(10, 6) && nums[arrayIndex] >= -1000000) {
                    arrayLength--;
                    sum = sum + nums[arrayIndex];
                    sumOfNums[arrayIndex] = sum;
                    arrayIndex++;
                } else {
                    return new int[]{};
                }

            }
        }
        return sumOfNums;*/

        int[] sumOfNums = new int[nums.length];
        sumOfNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumOfNums[i] = nums[i] + sumOfNums[i-1];
        }
        return sumOfNums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
        nums = new int[]{1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
        nums = new int[]{3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}