package com.designPatterns.creationalPatterns.prototype;

public class ProtoTypePatternDemo {


    public static void main(String args[]){

        ShapeCache shapeCache = new ShapeCache();

        Shape clonedRectangle = shapeCache.getShape("RECTANGLE");
        clonedRectangle.draw();

        Shape clonedCircle = shapeCache.getShape("CIRCLE");
        clonedCircle.draw();

        Shape clonedSquare = shapeCache.getShape("SQUARE");
        clonedSquare.draw();


    }


}
