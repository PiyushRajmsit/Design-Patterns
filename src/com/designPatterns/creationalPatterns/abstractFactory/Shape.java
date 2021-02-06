package com.designPatterns.creationalPatterns.abstractFactory;

public interface Shape {
    public void draw();
}


class Circle implements Shape {

    @Override
    public void draw(){
        System.out.println("Drawing a Round Circle");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
