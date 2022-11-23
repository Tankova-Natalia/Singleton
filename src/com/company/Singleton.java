package com.company;

public class Singleton {
    private volatile Singleton instance;
    private Singleton(){}

    private Singleton getInstance(){
        Singleton localInstance = instance;
        if (localInstance == null){
            synchronized (Singleton.class){
                if (localInstance == null)
                    instance = localInstance = new Singleton();
            }
        }
        return localInstance;
    }

}
