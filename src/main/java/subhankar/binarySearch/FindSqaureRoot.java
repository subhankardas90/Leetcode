package subhankar.binarySearch;
//69. Sqrt(x)
public class FindSqaureRoot {
    public int mySqrt(int x) {
        if(x==0 ||x ==1)
            return x;
        int low= 1;
        int high = x;
        int mid = -1;
        while(low<=high){
            mid = low+(high -low)/2;
            if((long)mid*mid ==(long)x)
                return mid;
            else if((long)mid*mid <x)
                low = mid+1;
            else
                high = mid-1;
        }
        return Math.round(high);
    }
}
