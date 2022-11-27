package org.example;

public class Singleton2 {  // lazy initiation

    private  static Singleton2 instance ;


    // constructor


    private Singleton2() {};

     public static synchronized Singleton2 getInstance()
    {
        if(instance == null)
            return new Singleton2();
        else
            return instance;
    }
}
