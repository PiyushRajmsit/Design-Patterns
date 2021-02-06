package com.designPatterns.creationalPatterns.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized singletonSynchronizedInstance;

    private SingletonSynchronized() {
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (singletonSynchronizedInstance == null) {
            singletonSynchronizedInstance = new SingletonSynchronized();
        }
        return singletonSynchronizedInstance;
    }
}

// Notes:
// Thread Safe
// Low Performance Due to Bottleneck of getInstance Method
// Synchronized Method is unnecessary after first time getInstance is invoked
