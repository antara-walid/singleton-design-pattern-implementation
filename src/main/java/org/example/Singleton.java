package org.example;

public class Singleton { // not thread safe

    private  static Singleton instance ;


    // constructor


    private Singleton() {};

    public static Singleton getInstance()
    {
        if(instance == null)
            return new Singleton();
        else
            return instance;
    }
}
