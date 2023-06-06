package module14;

class Foo {
    public void first(Runnable r) {
        System.out.println("first");
    }

    public void second(Runnable r) {
        System.out.println("second");
    }

    public void third(Runnable r) {
        System.out.println("third");
    }
}

class FooThread extends Thread {
    public void run() {
        System.out.println("Thread" + getName());
    }
}

public class FooTest {
    public static void main(String[] args) {
        Foo obfoo = new Foo();

        new FooThread(Foo :: first).start();

        new FooThread(() -> {
            obfoo.second();
        }).start();
        new FooThread(() -> {
            obfoo.third();
        }).start();
    }
}