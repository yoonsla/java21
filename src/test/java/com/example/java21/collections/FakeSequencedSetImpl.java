package com.example.java21.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class FakeSequencedSetImpl implements SequencedSetImpl {

    private final SequencedSet<String> sets = new LinkedHashSet<>();

    private SequencedSet<String> getSets() {
        sets.add("sangyoon");
        sets.add("sangyoon");
        sets.add("sangyoon2");
        return sets;
    }

    @Override
    public SequencedSet<String> reversed() {
        SequencedSet<String> sets = getSets();
        return sets.reversed();
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
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
