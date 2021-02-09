package com.designPatterns.creationalPatterns.prototype;

public abstract class Shape implements Cloneable{

    String type;
    String id;

    public String getType(){
        return type;
    }
    public String getId(){
        return id;
    }
    abstract void draw();

    protected Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape{

    Integer length = 10;
    Integer width = 5;

    public Rectangle(){
        this.type = "RECTANGLE";
        this.id = "1";
    }

    public void draw(){
        System.out.println("Rectangle is Drawn");
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }
}

class Circle extends Shape{

    Integer radius = 5;

    public Circle(){
        this.type = "CIRCLE";
        this.id = "2";
    }

    public void draw(){System.out.println("Circle is Drawn");}

    public Integer getRadius() {
        return radius;
    }
}

class Square extends Shape{

    Integer side = 10;

    public Square(){
        this.type = "SQUARE";
        this.id = "3";
    }
    public void draw(){System.out.println("Square is Drawn");}

    public Integer getSide() {
        return side;
    }
}

