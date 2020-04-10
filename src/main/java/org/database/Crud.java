package org.database;

public interface Crud<K, O> {
    K create(O object);
    O read(K key);
    void update(K key, O object);
    void delete(K key);
}
