package me.crazystone.study.map;

/**
 * Created by crazystone on 18-3-9.
 */
public interface Cache<K, V> {

    V get(K k);

    V put(K k, V v);

    V remove(K k);

}
