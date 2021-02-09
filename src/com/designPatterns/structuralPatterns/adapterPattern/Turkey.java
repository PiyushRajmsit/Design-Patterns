package com.designPatterns.structuralPatterns.adapterPattern;

interface Turkey {
    void gobble();
    void fly();
}


class WildTurkey implements Turkey{


    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey Flying Small Distances");
    }
}
