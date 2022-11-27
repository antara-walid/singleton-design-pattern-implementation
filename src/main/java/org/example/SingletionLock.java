package org.example;

public class SingletionLock {

    private static SingletionLock instance;

    // constructor
    private SingletionLock() {
    }

    public static SingletionLock getInstance() {
        if (instance == null) {
            synchronized (SingletionLock.class) {
                if (instance == null)
                    return new SingletionLock();
            }
        }
        return instance;
    }
}
