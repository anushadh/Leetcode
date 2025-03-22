package AddTwoIntegers_2235;

/*Given two integers num1 and num2, return the sum of the two integers.


Example 1:

Input: num1 = 12, num2 = 5
Output: 17
Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
Example 2:

Input: num1 = -10, num2 = 4
Output: -6
Explanation: num1 + num2 = -6, so -6 is returned.


Constraints:

        -100 <= num1, num2 <= 100*/

class Solution {
    public static int sum(int num1, int num2) {
            int sum = 0;
            if (num1 >= -100 && num2 <=100) {
                sum = num1 + num2;
            }
            return sum;
        }
    
        public static void main(String[] args) {
            System.out.println(sum(12, 5));
            System.out.println(sum(-10, 4));
            System.out.println(sum(-101, 4));
            System.out.println(sum(-100, 4));
            System.out.println(sum(-99, 4));
            System.out.println(sum(-101, 102));
    }
}