package RichestCustomerWealth_1672;

class Solution {
    public static int maximumWealth(int[][] accounts) {

        int wealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (sum > wealth)
                wealth = sum;
        }

        return wealth;
    }

    public static void main(String[] args) {
        int[][] nums = new int[3][2];
        nums[0][0] = 1;
        nums[0][1] = 5;
        nums[1][0] = 7;
        nums[1][1] = 3;
        nums[2][0] = 3;
        nums[2][1] = 5;
        System.out.println(maximumWealth(nums));


    }
}
