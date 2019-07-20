package org.quickstart.ehcache.jsr107;

/**
 * Created by fabien.sanglier on 10/8/16.
 */
public interface KeyValueGenerator<K, V> {
    K getKey(Number k);

    V getValue(Number v);
}
