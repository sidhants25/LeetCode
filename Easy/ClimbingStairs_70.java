public class ClimbingStairs_70 {

    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

      int s1 = climbStairs(n-1);
      int s2 = climbStairs(n-2);
      return s1+s2;
        
    }

}