package com.designPatterns.structuralPatterns.proxyPattern;

public interface Image {
    void display();
}

class RealImage implements Image{
    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadingFile();
    }

    private void loadingFile() {
        System.out.println("Loading from Memory "+ this.fileName);
    }

    @Override
    public void display() {
        System.out.println("Display the RealImage:" + this.fileName);
    }
}


class ProxyImage implements Image{

    RealImage realImage;
    String fileName;
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {

        if(realImage == null){
            realImage = new RealImage(this.fileName);
        }
        realImage.display();
    }
}