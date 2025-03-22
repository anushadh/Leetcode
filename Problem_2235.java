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