package subhankar.LC75;

//LC605
public class LC7504 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count = 0;

        for (int i = 0; i < length && count < n; i += 2) {
            if (flowerbed[i] == 0) {

                if (i == length - 1 || flowerbed[i + 1] == 0) {

                    n--;
                } else {

                    i++;
                }
            }
        }

        return  n<=0;
    }
}
