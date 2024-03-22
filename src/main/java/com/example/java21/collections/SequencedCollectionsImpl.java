package com.example.java21.collections;

import java.util.Collection;
import java.util.SequencedCollection;

public interface SequencedCollectionsImpl<E> extends Collection<E> {

    SequencedCollection<E> reversed();

    void addFirst(E e);

    void addLast(E e);

    E getFirst();

    E getLast();

    E removeFirst();

    E removeLast();
}
