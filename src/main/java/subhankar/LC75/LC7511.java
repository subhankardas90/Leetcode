package subhankar.LC75;

//LC 392. Is Subsequence
public class LC7511 {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(j<t.length()){
            if(i==s.length())
                return true;
            else if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==s.length();
    }
}
