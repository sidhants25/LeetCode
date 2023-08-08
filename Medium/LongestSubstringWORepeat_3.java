public class LongestSubstringWORepeat{

   public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        HashMap<String, Integer> map = new HashMap<>();
        int max = 1;
        int index = -1;

        for (int i = 0; i < s.length(); i++) {

            String letter = s.substring(i, i+1);

            if (!map.containsKey(letter)) {

                map.put(letter,i);

                if (i - index > max) {
                    max = i - index;
                }
                
            }
            else {

                if (index < map.get(letter)) {
                    index = map.get(letter);
                }

                if (max < i-index){
                    max = i-index;
                }
                
                map.replace(letter, i);
            }
        }

        return max;
    }
}