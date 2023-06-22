package com.zdmitrij.modules.module14a;

import java.util.concurrent.CompletableFuture;

class Foo {

    public void first(Runnable r) {
        System.out.print("first");
    }

    public void second(Runnable r) {
        System.out.print("second");
    }

    public void third(Runnable r) {
        System.out.print("third");
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
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}