package com.example.java21.collections;

import java.util.Map;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

interface SequencedMapImpl<K, V> extends Map<K, V> {

    // new methods
    SequencedMap<K, V> reversed();

    SequencedSet<K> sequencedKeySet();

    SequencedCollection<V> sequencedValues();

    SequencedSet<Entry<K, V>> sequencedEntrySet();

    V putFirst(K k, V v);

    V putLast(K k, V v);

    Entry<K, V> firstEntry();

    Entry<K, V> lastEntry();

    Entry<K, V> pollFirstEntry();

    Entry<K, V> pollLastEntry();
}
