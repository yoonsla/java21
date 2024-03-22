package com.example.java21.collections;

import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;

public interface SequencedSetImpl<E> extends Set<E>, SequencedCollection<E> {

    SequencedSet<E> reversed();
}
