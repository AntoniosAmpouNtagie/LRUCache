package LeastResentlyUsed;


public class LRU {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,6);
        lruCache.put(2,3);
        lruCache.print();
        System.out.println(lruCache.get(1));
        lruCache.print();
        lruCache.put(3,5);
        lruCache.print();
        System.out.println(lruCache.get(2));
        lruCache.print();
        lruCache.put(4,4);
        lruCache.print();
        System.out.println(lruCache.get(3));
        lruCache.print();
    }
}
