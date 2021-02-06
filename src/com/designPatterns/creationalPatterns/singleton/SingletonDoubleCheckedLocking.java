package com.designPatterns.creationalPatterns.singleton;

public class SingletonDoubleCheckedLocking {

    private volatile static SingletonDoubleCheckedLocking singletonDoubleCheckedLockingInstance;

    private SingletonDoubleCheckedLocking() {
    }

    public static SingletonDoubleCheckedLocking getInstance() {
        if (singletonDoubleCheckedLockingInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class){
                if(singletonDoubleCheckedLockingInstance == null){
                    singletonDoubleCheckedLockingInstance = new SingletonDoubleCheckedLocking();
                }
                return singletonDoubleCheckedLockingInstance;
            }
        }
        return singletonDoubleCheckedLockingInstance;
    }
}

// Notes
// Thread Safe
// Increased Performance over Synchronized Singleton class method