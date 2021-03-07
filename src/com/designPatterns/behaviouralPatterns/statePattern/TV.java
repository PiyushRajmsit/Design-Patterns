package com.designPatterns.behaviouralPatterns.statePattern;

public class TV {

    RemoteControl remoteControl;
    public void setState(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public TV(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public void pressButton(){
        remoteControl.pressSwitch(this);
    }

    public void displayState(){
        remoteControl.displayState();
    }
}
