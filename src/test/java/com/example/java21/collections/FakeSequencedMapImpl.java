package com.example.java21.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.Set;

public class FakeSequencedMapImpl implements SequencedMapImpl {

    private final SequencedMap<String, String> map = new LinkedHashMap<>();

    private SequencedMap<String, String> getMap() {
        map.put("sangyoon", "hi");
        map.put("sangyoon2", "hi2");
        map.put("sangyoon3", "hi3");
        return map;
    }

    @Override
    public SequencedMap<String, String> reversed() {
        SequencedMap<String, String> map = getMap();
        return map.reversed();
    }

    @Override
    public SequencedSet<String> sequencedKeySet() {
        return null;
    }

    @Override
    public SequencedCollection sequencedValues() {
        return null;
    }

    @Override
    public SequencedSet<Entry> sequencedEntrySet() {
        return null;
    }

    @Override
    public Object putFirst(Object o, Object o2) {
        SequencedMap<String, String> map = getMap();
        map.putFirst(o.toString(), o2.toString());
        return map;
    }

    @Override
    public Object putLast(Object o, Object o2) {
        SequencedMap<String, String> map = getMap();
        map.putLast(o.toString(), o2.toString());
        return map;
    }

    @Override
    public Entry firstEntry() {
        return null;
    }

    @Override
    public Entry lastEntry() {
        return null;
    }

    @Override
    public Entry pollFirstEntry() {
        return null;
    }

    @Override
    public Entry pollLastEntry() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
