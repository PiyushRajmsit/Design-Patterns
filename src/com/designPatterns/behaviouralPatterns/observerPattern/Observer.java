package com.designPatterns.behaviouralPatterns.observerPattern;

public interface Observer {
    public void update(Integer runs,Integer wickets,Integer overs);
}


class CurrentScore implements Observer{

    Integer runs;
    Integer wickets;
    Integer overs;

    @Override
    public void update(Integer runs,Integer wickets,Integer overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        displayScore();
    }

    private void displayScore() {
        System.out.println("Current Score Displays");
        System.out.println("The Current Score is:" + "Runs - " + runs + " ," + "Overs - " + overs + " ," + "Wickets - " + wickets);
    }

    public CurrentScore() {
        this.runs = 0;
        this.wickets = 0;
        this.overs = 0;
    }
}

class AverageScore implements Observer{

    Double runRate;
    Double predictedScore;
    @Override
    public void update(Integer runs, Integer wickets, Integer overs) {
        this.runRate = Double.valueOf(runs/overs);
        this.predictedScore = runRate * 50;
        displayScore();
    }

    private void displayScore() {
        System.out.println("Average Score Displays");
        System.out.println("The Run-Rate and Predicted Score is : " + this.runRate + " , " + this.predictedScore );
    }

    public AverageScore() {
        runRate = 0.0;
    }

}


