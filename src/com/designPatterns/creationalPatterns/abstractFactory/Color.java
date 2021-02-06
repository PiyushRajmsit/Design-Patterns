package com.designPatterns.creationalPatterns.abstractFactory;

interface Color {
    public void fillColor();
}

class Red implements Color{
    @Override
    public void fillColor() {
        System.out.println("Fill Color Red");
    }
}

class Blue implements Color{
    @Override
    public void fillColor() {
        System.out.println("Fill Color Blue");
    }
}

class Green implements Color{
    @Override
    public void fillColor() {
        System.out.println("Fill Color Green");
    }
}
