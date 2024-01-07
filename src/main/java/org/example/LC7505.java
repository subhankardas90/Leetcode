package org.example;

//LC - 345
public class LC7505 {

    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length-1;
        while(start<end){
            if(isVowel(str[start]) && isVowel(str[end])){
                System.out.println(str[start]+" : "+str[end]);
                char temp = str[start] ;
                str[start] = str[end];
                str[end]=temp;
                start++;
                end--;
            }else if(isVowel(str[start])){
                end--;
            }else if(isVowel(str[end])){
                start++;
            }else{
                start++;
                end--;
            }

        }

        return new String(str);
    }
    boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
}
