package com.designPatterns.creationalPatterns.factoryPattern;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCreatorMethod {

    private Map<String,Shape> shapeMap;

    public ConcreteCreatorMethod() {
        shapeMap = new HashMap<>();
        shapeMap.put("Circle", new Circle());
        shapeMap.put("Square", new Square());
        shapeMap.put("Rectangle", new Rectangle());
    }

    public Shape getShape(String shapeType){
        if(shapeType.contains(shapeType)){
            return shapeMap.get(shapeType);
        }
        return null;
    }

}

class ConcreteCreatorClient{

    public static void main(String[] args){

        ConcreteCreatorMethod concreteCreatorMethod = new ConcreteCreatorMethod();

        Shape circle = concreteCreatorMethod.getShape("Circle");
        circle.draw();

        Shape square = concreteCreatorMethod.getShape("Square");
        square.draw();

        Shape rectangle = concreteCreatorMethod.getShape("Rectangle");
        rectangle.draw();

    }
}