package LeastResentlyUsed;

import java.util.*;

public class LRUCache {

    private final int capacity;
    private final LinkedList<Integer> lru;
    private final HashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.lru = new LinkedList<>();

    }

    public void put(Integer key, Integer value) {
        if (map.containsKey(key)) {
            lru.remove(key);
        } else if (lru.size() == capacity) {
            map.remove(lru.removeLast());
        }
        lru.addFirst(key);
        map.put(key, value);
    }

    public int get(Integer key) {
        if (map.containsKey(key)) {
            lru.remove(key);
            lru.addFirst(key);
            return map.get(key);
        }
        return -1;
    }

    public void print() {
        System.out.println(lru);
        System.out.println(map);
    }

}
