import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings_205 {

    //205. Isomorphic Strings
    //Expected O(length(s)) solution
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        HashSet<Character> set = new HashSet();
        for (int j = 0; j < t.length(); j++){
            set.add(t.charAt(j));
        }
        for (int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                if(!set.contains(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
                set.remove(t.charAt(i));
            }
            else if(t.charAt(i) != map.get(s.charAt(i))){
                return false;
            }
        }
        return true;

    }
}