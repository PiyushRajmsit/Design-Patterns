package com.designPatterns.creationalPatterns.factoryPattern;

public abstract class AbstractCreatorMethod {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}

class RectangleFactory extends AbstractCreatorMethod{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class CircleFactory extends AbstractCreatorMethod{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}

class SquareFactory extends AbstractCreatorMethod{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}

class AbstractCreatorClient{
    public static void main(String[] args){

        Shape circle = new CircleFactory().factoryMethod();
        circle.draw();

        Shape rectangle = new RectangleFactory().factoryMethod();
        rectangle.draw();

        Shape square = new SquareFactory().factoryMethod();
        square.draw();
    }

}


