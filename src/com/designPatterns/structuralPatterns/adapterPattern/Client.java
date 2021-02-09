package com.designPatterns.structuralPatterns.adapterPattern;

public class Client {

    public static void main(String args[]){

        WildDuck wildDuck = new WildDuck();
        System.out.println("Ducks Says");
        wildDuck.quack();
        System.out.println("Ducks Flies");
        wildDuck.fly();


        WildTurkey wildTurkey = new WildTurkey();
        System.out.println("Turkey Says");
        wildTurkey.gobble();
        System.out.println("Turkey Flies");
        wildTurkey.fly();


        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("TurkeyAdapted Duck Says");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }

}
