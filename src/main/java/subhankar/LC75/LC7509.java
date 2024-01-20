package subhankar.LC75;
//LC 443. String Compression
public class LC7509 {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int n =1;
        sb.append(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(chars[i-1]== chars[i]){
                n++;
            }
            else{
                if(n>1)
                    sb.append(n+"");
                sb.append(chars[i]+"");
                n=1;
            }
        }
        //sb.append(chars[chars.length-1]+"");
        if(n>1)
            sb.append(n+"");

        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
