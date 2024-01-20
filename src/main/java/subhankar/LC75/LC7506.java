package subhankar.LC75;

//LC -151. Reverse Words in a String
public class LC7506 {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        for(int i=0;i<str.length/2;i++){
            String temp = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = temp;
        }

        return String.join(" ", str).strip();
    }
}
