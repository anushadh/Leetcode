package GreatestCommonDivisorOfStrings_1071;

import java.util.HashMap;
import java.util.Objects;

class Solution {
    public static String gcdOfStrings(String str1, String str2) {

//        StringBuffer sb = new StringBuffer();
//        HashMap<String, Integer> stringGdc = new HashMap<>();
//        int j = 0;
//        for (int i = 0; i < str1.length(); i++) {
//            for (j = i; j < str2.length(); j++) {
//                if (str1.charAt(i) == str2.charAt(j)) {
//                    sb.append(str1.charAt(i));
//                    stringGdc.
//                }
//                break;
//            }
//        }
//        return sb.toString();

        if(str1.equals(str2)){
            return str1;
        }
        if(str2.length() == str1.length()) {
            return "";
        }
        String gcdBase = str1;
        String longerString = str2;
        if(str1.length() > str2.length()) {
            gcdBase = str2;
            longerString = str1;
        }
        //System.out.println("Base:" + gcdBase);
        //System.out.println("longerString:" + longerString);
        int c = gcdBase.length();
        while(!gcdBase.isEmpty()) {
            if(longerString.length() % gcdBase.length() == 0 && c % gcdBase.length() == 0) {
                int count = longerString.length() / gcdBase.length();
                StringBuilder temp = new StringBuilder(gcdBase);
                //System.out.println("temp:" + temp.toString());
                while(count > 1){
                    temp.append(gcdBase);
                    count--;
                }
                if(temp.toString().equals(longerString)){
                    return gcdBase;
                } else {
                    return "";
                }
            } else gcdBase = gcdBase.substring(0, gcdBase.length() - 1);
            System.out.println("Base2:" + gcdBase);
        }
        return "";
    }

    public static void main(String[] args) {
        String word1 = "ABCABC";
        String word2 = "ABC";
        System.out.println(gcdOfStrings(word1, word2));
        word1 = "ABABAB";
        word2 = "ABAB";
        System.out.println(gcdOfStrings(word1, word2));
        word1 = "LEET";
        word2 = "CODE";
        System.out.println(gcdOfStrings(word1, word2));
        word1 = "ABCDEF";
        word2 = "ABC";
        System.out.println(gcdOfStrings(word1, word2));
        word1 = "AAAAAAAAA";
        word2 = "AAACCC";
        System.out.println(gcdOfStrings(word1, word2));

    }
}
