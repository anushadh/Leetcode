package FizzBuzz_412;

import java.util.ArrayList;
import java.util.List;

/*
* Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


Constraints:

1 <= n <= 104
* */

class Solution {
    public static List<String> fizzBuzz(int n) {

        List<String> fizzBuzz = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if(i%3 == 0) {
                fizzBuzz.add("Fizz");
            } else if(i%5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(Integer.toString(i));
            }
        }
        return fizzBuzz;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}
