package com.example.java21.collections;

import java.util.SequencedCollection;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Log4j2
class SequencedCollectionsTest {

    SequencedCollectionsImpl sequencedCollections;

    @BeforeEach
    void init() {
        sequencedCollections = new FakeSequencedCollectionsImpl();
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
}
