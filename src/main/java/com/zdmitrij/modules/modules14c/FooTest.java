package com.zdmitrij.modules.modules14c;

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

        CompletableFuture thr1 = CompletableFuture.runAsync(() -> {
            foo.first(new Thread());
        });

        CompletableFuture thr2 = CompletableFuture.runAsync(() -> {
            foo.second(new Thread());
        });

        CompletableFuture thr3 = CompletableFuture.runAsync(() -> {
            foo.third(new Thread());
        });

        while(!thr1.isDone() || !thr2.isDone() || !thr3.isDone() ) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}