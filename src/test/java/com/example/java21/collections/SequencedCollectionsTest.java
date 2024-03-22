package com.example.java21.collections;

import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
class SequencedCollectionsTest {

    SequencedCollectionsImpl sequencedCollections;
    SequencedSetImpl sequencedSet;
    SequencedMapImpl sequencedMap;

    @BeforeEach
    void init() {
        sequencedCollections = new FakeSequencedCollectionsImpl();
        sequencedSet = new FakeSequencedSetImpl();
        sequencedMap = new FakeSequencedMapImpl();
    }

    @Test
    @DisplayName("list를 reverse 한다.")
    void reversed() {
        SequencedCollection numbers = sequencedCollections.reversed();
        log.info("reversed ==> {}", numbers);
    }

    @Test
    @DisplayName("list 맨 앞에 값을 추가한다.")
    void addFirst() {
        sequencedCollections.addFirst(4);
    }

    @Test
    @DisplayName("list 맨 앞에 값을 추가한다.")
    void addLast() {
        sequencedCollections.addLast(4);
    }

    @Test
    @DisplayName("list 첫 번째 값을 가져온다.")
    void getFirst() {
        Object number = sequencedCollections.getFirst();
        log.info("getFirst ==> {}", number);
    }

    @Test
    @DisplayName("list 마지막 값을 가져온다.")
    void getLast() {
        Object number = sequencedCollections.getLast();
        log.info("getLast ==> {}", number);
    }

    @Test
    @DisplayName("list 첫 번째 값을 지운다.")
    void removeFirst() {
        Object number = sequencedCollections.removeFirst();
        log.info("remove first ==> {}", number);
    }

    @Test
    @DisplayName("list 마지막 값을 지운다.")
    void removeLast() {
        Object number = sequencedCollections.removeLast();
        log.info("remove last ==> {}", number);
    }

    @Test
    @DisplayName("set을 reverse 한다.")
    void reversedSet() {
        SequencedSet reversed = sequencedSet.reversed();
        log.info("reversed set ==> {}", reversed);
    }

    @Test
    @DisplayName("map을 reverse 한다.")
    void reversedMap() {
        SequencedMap reversed = sequencedMap.reversed();
        log.info("reversed map ==> {}", reversed);
    }

    @Test
    @DisplayName("map을 맨 앞에 put 한다.")
    void putFirst() {
        Object map = sequencedMap.putFirst("sangyoon0", "hi0");
        log.info("putFirst map ==> {}", map);
    }

    @Test
    @DisplayName("map을 맨 뒤에 put 한다.")
    void putLast() {
        Object map = sequencedMap.putLast("sangyoon4", "hi4");
        log.info("putLast map ==> {}", map);
    }
}
