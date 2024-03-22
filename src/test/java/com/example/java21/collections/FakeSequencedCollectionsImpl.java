package com.example.java21.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class FakeSequencedCollectionsImpl implements SequencedCollectionsImpl {

    private final List<Integer> numberList = new ArrayList<>();

    public List<Integer> getNumbers() {
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        return numberList;
    }

    @Override
    public List<Integer> reversed() {
        List<Integer> numbers = getNumbers();
        return numbers.reversed();
    }

    @Override
    public void addFirst(Object param) {
        List<Integer> numbers = getNumbers();
        numbers.addFirst((Integer) param);
        log.info("addFirst ==> {}", numbers);
    }

    @Override
    public void addLast(Object param) {
        List<Integer> numbers = getNumbers();
        numbers.addLast((Integer) param);
        log.info("addLast ==> {}", numbers);
    }

    @Override
    public Integer getFirst() {
        List<Integer> numbers = getNumbers();
        return numbers.getFirst();
    }

    @Override
    public Integer getLast() {
        List<Integer> numbers = getNumbers();
        return numbers.getLast();
    }

    @Override
    public List<Integer> removeFirst() {
        List<Integer> numbers = getNumbers();
        numbers.removeFirst();
        return numbers;
    }

    @Override
    public List<Integer> removeLast() {
        List<Integer> numbers = getNumbers();
        numbers.removeLast();
        return numbers;
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
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
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
