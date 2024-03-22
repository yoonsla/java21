package com.example.java21.thread;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ThreadAppRunner implements ApplicationRunner {

    private final VirtualThread virtualThread;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        virtualThread.run();
    }
}
