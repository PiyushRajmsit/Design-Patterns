package com.designPatterns.creationalPatterns.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap;

    public ShapeCache(){
        shapeMap = new Hashtable<>();
        shapeMap.put("RECTANGLE",new Rectangle());
        shapeMap.put("CIRCLE",new Circle());
        shapeMap.put("SQUARE",new Square());
    }

    public Shape getShape(String shapeType){
        Shape clonedShape = shapeMap.get(shapeType);
        return (Shape) clonedShape.clone();
    }

}
