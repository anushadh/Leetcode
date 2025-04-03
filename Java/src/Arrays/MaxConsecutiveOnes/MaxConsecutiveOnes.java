package Arrays.MaxConsecutiveOnes;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2
//
//
//Constraints:
//
//        1 <= nums.length <= 105
//nums[i] is either 0 or 1.

class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int temp = 0;

        for (int i : nums) {
            if (i != 1) {
                maxCount = Math.max(temp, maxCount);
                temp = 0;
            } else {
                temp++;
            }
            //System.out.println(temp + " " + maxCount);
        }
        return Math.max(temp, maxCount);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums1));
        System.out.println(findMaxConsecutiveOnes(nums2));
    }
}


