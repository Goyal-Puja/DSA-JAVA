package lru_cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
    private Deque<Integer> doublyQueue;
    private HashSet<Integer> hashSet;
    private final int CACHE_SIZE;

    LRUCache(int capacity){
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    public void refer(int page){                                       // time complexity : O(1)
        if(!hashSet.contains(page)){
            if(doublyQueue.size() == CACHE_SIZE){
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        } else {
            doublyQueue.remove(page);
        }
        doublyQueue.push(page);
        hashSet.add(page);
    }
    public void display(){                                              // time complexity : O(n)
        Iterator<Integer> it = doublyQueue.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String[] args){
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.display();

    }
}

// Cache replacement algorithms are efficiently design to replace the cache when the space is full.
// The Least Recently used (LRU) is one of those algorithms. As the name suggests when the cache memory is full,
// LRU picks the data that is least recently used and removes it in order to make space for the new data.
// The priority of the data in the cache changes according to the need of the data i.e. if some data is fetched or updated recently
// then the priority of the data would be changed and assigned to the highest priority.....

// space complexity : O(CACHE_SIZE)