package subhankar.LC75;

//LC 1456. Maximum Number of Vowels in a Substring of Given Length

public class LC7515 {
    public int maxVowels(String s, int k) {
        int count =0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
                count++;
        }
        int maxCount = count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k)))
                count--;
            if(isVowel(s.charAt(i)))
                count++;
            maxCount = Math.max( maxCount, count);
        }
        return maxCount;
    }
    boolean isVowel(char c){
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        else
            return false;
    }
}
