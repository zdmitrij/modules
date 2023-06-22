package com.zdmitrij.modules.modules14b;

import java.util.concurrent.CompletableFuture;

class Foo {
    volatile int counter = 1;

    public void first(Runnable r) {
        System.out.print("first");
        counter = 2;
    }

    public void second(Runnable r) {
        if (counter == 2) {
            System.out.print("second");
            counter = 3;
        }
    }

    public void third(Runnable r) {
        if (counter == 3) {
            System.out.print("third");
        }
    }
}

public class FooTest {
    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture.runAsync(() -> {
            foo.first(new Thread());
        });

        CompletableFuture.runAsync(() -> {
            foo.second(new Thread());
        });

        CompletableFuture.runAsync(() -> {
            foo.third(new Thread());
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}