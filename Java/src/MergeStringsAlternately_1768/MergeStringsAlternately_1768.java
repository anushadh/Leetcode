package MergeStringsAlternately_1768;

import MiddleOfTheLinkedList_876.ListNode;

class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();
        int j = 0;
        for (int i = 0; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
            for (j = i; j < word2.length(); j++) {
                sb.append(word2.charAt(j));
                if(i == word1.length()-1) {
                    continue;
                }
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcdefghij";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
        word1 = "abc";
        word2 = "pqrstuvwxyz";
        System.out.println(mergeAlternately(word1, word2));
        word1 = "abcd";
        word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));

    }
}