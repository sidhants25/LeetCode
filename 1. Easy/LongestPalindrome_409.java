public class LongestPalindrome_409{

    public int longestPalindrome(String s) {

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            
            String z = s.substring(i,i+1);
            
            if (!map.containsKey(z)) {
                map.put(z,1);
            }

            else {
                map.replace(z,map.get(z) + 1);
            }

        }

        boolean odd = false;
        int allEvens = 0;

        for (Map.Entry<String,Integer> entry : map.entrySet()){

            if (entry.getValue() % 2 == 0){
                allEvens += entry.getValue();
            }

            else {

                odd = true;
                allEvens += entry.getValue() - 1;
            }
        }

        if (!odd){
            return allEvens;
        }
        else {
            return  allEvens + 1;
        }

        
    }   
}