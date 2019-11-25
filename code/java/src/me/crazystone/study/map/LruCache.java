package me.crazystone.study.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by crazystone on 18-3-9.
 */
public class LruCache<K, V> implements Cache<K, V> {

    int maxSize;
    LinkedHashMap<K, V> map;
    private int size;
    private int hitCount, searchCount;

    public LruCache(int maxSize) {
        this.maxSize = maxSize;
        map = new LinkedHashMap<K, V>(16, .75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > maxSize;
            }
        };
    }


    @Override
    public V get(K k) {
        return map.get(k);
    }

    @Override
    public V put(K k, V v) {
        return map.put(k, v);
    }

    @Override
    public V remove(K k) {
        V v = map.remove(k);
        return v;
    }


}
