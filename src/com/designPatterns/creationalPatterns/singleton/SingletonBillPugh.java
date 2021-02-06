package com.designPatterns.creationalPatterns.singleton;

public class SingletonBillPugh {

    private static class SingletonHelper{
        private static final SingletonBillPugh singletonBillPughInstance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance(){
        return SingletonHelper.singletonBillPughInstance;
    }

}
