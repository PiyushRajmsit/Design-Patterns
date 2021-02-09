package com.designPatterns.structuralPatterns.adapterPattern;

interface Duck {
    void quack();
    void fly();
}

class WildDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck Flies Away");
    }
}

