package com.ali.faizan.coding.model;

import com.ali.faizan.coding.callback.Pair;

public class Pairs<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public Pairs(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}