package com.designPatterns.behaviouralPatterns.statePattern;

interface RemoteControl {
    void pressSwitch(TV context);
    void displayState();
}


class On implements RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Tv is On RightNow. Going to be Off Now");
        context.setState(new Off());
    }

    @Override
    public void displayState() {
        System.out.println("TV is On.");
    }
}
class Off implements RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Tv is Off RightNow. Going to be On Now");
        context.setState(new On());
    }

    @Override
    public void displayState() {
        System.out.println("TV is Off.");
    }
}



