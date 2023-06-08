import java.util.HashMap;

public class ValidAnagram_242 {

    //242. Valid Anagram
    // O(length(s)) solution

    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) {
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.replace(c,map.get(c)+1);
            }
        }

        for(int j = 0; j < t.length(); j++) {
            char d = t.charAt(j);
            if (!map.containsKey(d)) {
                return false;
            }
            else if (map.get(d)==1) {
                map.remove(d);
            }
            else {
                map.replace(d,map.get(d)-1);
            }
        }

        return map.isEmpty();

    }
}