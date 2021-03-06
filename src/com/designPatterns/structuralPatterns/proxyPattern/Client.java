package com.designPatterns.structuralPatterns.proxyPattern;

public class Client {


    public static void main(String[] args){

        Image image = new ProxyImage("PuppiesImage");

        image.display();
        System.out.println("Image Stored and Cached");
        image.display();
    }
}
