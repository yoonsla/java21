package com.example.java21.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class VirtualThread {

    public void run() {
        // Virtual Thread 방법 1
        Thread.startVirtualThread(() -> log.info("Hello Virtual Thread"));

        // Virtual Thread 방법 2
        Runnable runnable = () -> log.info("Hi Virtual Thread");
        Thread.ofVirtual().start(runnable);

        // Virtual Thread 방법 3
        // Virtual Thread 이름 지정
        Thread.Builder builder = Thread.ofVirtual().name("JVM-Thread");
        Thread virtualThread2 = builder.start(runnable);

        // 스레드가 Virtual Thread인지 확인
        log.info("Thread is Virtual? ==> {}", virtualThread2.isVirtual());

        // ExecutorService
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i <=5; i++) {
                executorService.submit(runnable);
            }
        }
    }
}
