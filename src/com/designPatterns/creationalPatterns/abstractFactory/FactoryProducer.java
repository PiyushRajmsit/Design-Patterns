package com.designPatterns.creationalPatterns.abstractFactory;
import java.util.HashMap;
import java.util.Map;

public class FactoryProducer{

    private Map<String,AbstractFactory> factoryMap;

    public FactoryProducer() {
        factoryMap = new HashMap<>();
        factoryMap.put("Shape", new ShapeFactory());
        factoryMap.put("Color", new ColorFactory());
    }
    public AbstractFactory getFactory(String choice){
        return factoryMap.get(choice);
    }
}

abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    abstract Color getColor(String color);
}


class ShapeFactory extends AbstractFactory{

    private Map<String, Shape> shapeMap;
    public ShapeFactory() {
        shapeMap = new HashMap<>();
        shapeMap.put("Circle", new Circle());
        shapeMap.put("Square", new Square());
        shapeMap.put("Rectangle", new Rectangle());
    }
    @Override
    Shape getShape(String shapeType) {
        return shapeMap.get(shapeType);
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactory{

   private Map<String,Color> colorMap;

   public ColorFactory() {
       colorMap = new HashMap<>();
       colorMap.put("Red",new Red());
       colorMap.put("Blue",new Blue());
       colorMap.put("Green",new Green());
   }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {
        return colorMap.get(color);
    }

}

class AbstractFactoryClient{

    public static void main(String[] args){

        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory shapeFactory = factoryProducer.getFactory("Shape");
        AbstractFactory colorFactory = factoryProducer.getFactory("Color");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Color red = colorFactory.getColor("Red");
        red.fillColor();
        Color blue = colorFactory.getColor("Blue");
        blue.fillColor();
        Color green = colorFactory.getColor("Green");
        green.fillColor();

    }

}

