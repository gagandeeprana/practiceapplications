package com.example;

public class CustomHashMap<K, V> {

    private Entry<K, V>[] table;
    private int capacity = 16;
    
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            super();
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public CustomHashMap() {
        table = new Entry[capacity];
    }
}
