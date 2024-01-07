package org.example;

//LC1768
public class LC7501 {

    /**
     * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
     *
     * Return the merged string.
     *
     *
     *
     * Example 1:
     *
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * Explanation: The merged string will be merged as so:
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
     * Example 2:
     *
     * Input: word1 = "ab", word2 = "pqrs"
     * Output: "apbqrs"
     * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
     * word1:  a   b
     * word2:    p   q   r   s
     * merged: a p b q   r   s*/

    public String mergeAlternately(String word1, String word2) {
        int word1L = word1.length();
        int word2L = word2.length();
        int minL = Math.min(word1L, word2L);
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<minL;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1L<word2L){
            sb.append(word2.substring(minL,word2L));
        }else{
            sb.append(word1.substring(minL,word1L));
        }
        return sb.toString();
    }
}
