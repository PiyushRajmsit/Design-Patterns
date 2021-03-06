package com.designPatterns.behaviouralPatterns.observerPattern;

public class ClientClass {

    public static void main(String args[]){

        AverageScore averageScore = new AverageScore();
        CurrentScore currentScore = new CurrentScore();

        CricketData cricketData = new CricketData(100,2,20);
        cricketData.register(averageScore);
        cricketData.register(currentScore);

        cricketData.update();


    }

}
