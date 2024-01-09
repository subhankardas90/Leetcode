package org.example;

import java.util.Stack;

//LC 2390. Removing Stars From a String
public class LC7524 {
    public String removeStars(String str) {

        Stack<Character> s = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '*') {
                s.pop();
            }
            else {
                s.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        return sb.toString();

    }
}
