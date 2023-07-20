public class RansomNote_383{

    public boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()){
            return false;
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++ ){
            
            String x = magazine.substring(i,i+1);

            if (!map.containsKey(x)){
                map.put(x,1);
            }
            else {
                map.replace(x, map.get(x)+1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++){
            
            String x = ransomNote.substring(i,i+1);
    
            if (!map.containsKey(x)){
                return false;
            }
            else {
                map.replace(x, map.get(x)-1);
                if (map.get(x) == 0){
                    map.remove(x);
                }
            }

        }

        return true;
        
    }

}