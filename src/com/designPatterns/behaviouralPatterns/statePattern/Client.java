package com.designPatterns.behaviouralPatterns.statePattern;

public class Client {

    public static void main(String args[]){

        Off off = new Off();
        TV tv = new TV(off);
        tv.displayState();
        tv.pressButton();
        tv.displayState();
        tv.pressButton();
        tv.displayState();
    }
}
