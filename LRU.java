package LeastResentlyUsed;


public class LRU {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(50);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.print();
        System.out.println(lruCache.get(1));
        lruCache.print();
        lruCache.put(3,3);
        lruCache.print();
        System.out.println(lruCache.get(2));
        lruCache.print();
        lruCache.put(4,4);
        lruCache.print();
        System.out.println(lruCache.get(3));
        lruCache.print();
    }
}
