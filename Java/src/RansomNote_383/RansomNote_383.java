package RansomNote_383;

//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//
//
//
//        Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
//
//
//Constraints:
//
//        1 <= ransomNote.length, magazine.length <= 105
//ransomNote and magazine consist of lowercase English letters.

import java.util.HashMap;
import java.util.Hashtable;

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = magazine.indexOf(ransomNote.charAt(i));
            if (index == -1) {
                    return false;
                } else {
                    magazine = magazine.substring(0, index) + magazine.substring(index + 1);

                }
        }
        return true;

//        HashMap<Character, Integer> magazineMap = new HashMap<>();
//        for (int i = 0; i < magazine.length(); i++) {
//            char m = magazine.charAt(i);
//            int count = magazineMap.getOrDefault(m, 0);
//            magazineMap.put(m, count+1);
//        }
//        for (int i = 0; i < ransomNote.length(); i++) {
//            char r = ransomNote.charAt(i);
//            int count = magazineMap.getOrDefault(r, 0);
//            if(count == 0) {
//                return false;
//            } else {
//                magazineMap.put(r, count-1);
//            }
//        }
//        return true;

    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
        ransomNote = "aa";
        magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
        ransomNote = "aa";
        magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
        ransomNote = "anu";
        magazine = "anusha";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
