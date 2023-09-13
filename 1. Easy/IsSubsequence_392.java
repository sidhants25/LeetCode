public class IsSubsequence_392 {
    //392. Is Subsequence
    // O(length(t)) solution
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        if (s.length() > t.length()){
            return false;
        }
        char curr = s.charAt(0);
        int count = 0;

        for (int i = 0 ; i < t.length(); i++){
            if (t.charAt(i) == curr){
                count++;
                if (count == s.length()){
                    return true;
                }
                curr = s.charAt(count);
            }
        }
        return false;
    }
}