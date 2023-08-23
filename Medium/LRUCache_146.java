public class LRUCache_146 {

    private HashMap<Integer,Integer> map;
    private int capacity;
    ArrayList<Integer> queue = new ArrayList<>();
    
    public LRUCache(int capacity) {

        map = new HashMap<>(capacity);
        this.capacity = capacity;
        
    }
    
    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        queue.remove(queue.indexOf(key));
        queue.add(key);

        return map.get(key);
        
    }
    
    public void put(int key, int value) {

        if (map.size() >= capacity && !map.containsKey(key)) {
            int remove = queue.get(0);
            queue.remove(0);
            map.remove(remove);
        }
        
      
            
            if (map.containsKey(key)){
                map.replace(key,value);
                queue.remove(queue.indexOf(key));
                queue.add(key);
            }
            else {
                map.put(key,value);
                queue.add(key);
            }


        }
        
    }