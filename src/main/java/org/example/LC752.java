package org.example;

//LC1071
public class LC752 {
    public String gcdOfStrings(String str1, String str2) {
        //if str1+str2 === str2+str1, then only there will be a GCD of strings or else return ""
        //GCD string will be from start to gcd number of the string
        if((str1+str2).equals(str2+str1)){
            int gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
        }else{
            return "";
        }
    }

    //code to find the gcd of length of string
    int gcd(int a, int b){
        while(b%a !=0){
            int rem = b%a;
            b= a;
            a = rem;
        }
        return a;
    }
}
