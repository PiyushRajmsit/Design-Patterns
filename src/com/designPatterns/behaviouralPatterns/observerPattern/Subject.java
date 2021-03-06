package com.designPatterns.behaviouralPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObserver();
}


class CricketData implements Subject{

    private List<Observer> observerList;
    private Integer runs;
    private Integer wickets;
    private Integer overs;
    private boolean changes = false;

    public CricketData(Integer runs, Integer wickets, Integer overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.changes = true;
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {

        if(observer == null)
            throw new NullPointerException("Null Object");
        if(!observerList.contains(observer))
            observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if(changes){
            List<Observer> observerList = new ArrayList<>(this.observerList);
            for(Observer observer: observerList){
                observer.update(this.runs,this.wickets,this.overs);
            }

        }
    }
    public void update(){
        notifyObserver();
    }

}