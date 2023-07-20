public class FirstBadVersion_278{

    public int firstBadVersion(int n) {

        int lo = 1;
        int hi = n;
        while (lo < hi) {
            
            int mid = lo + (hi - lo)/2;
        
            boolean curr = isBadVersion(mid);
            boolean prev = isBadVersion(mid-1);

            if (curr && !prev){
                return mid;
            }

            else if (!curr) {
                lo = mid + 1;
            }

            else {
                hi = mid - 1;
            }

        }

        return lo;
        
    }

    
}