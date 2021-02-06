package com.designPatterns.creationalPatterns.singleton;

public class SingletonLazyEvaluation {

    private static SingletonLazyEvaluation singletonLazyEvaluationInstance;

    private SingletonLazyEvaluation() {
    }

    public static SingletonLazyEvaluation getInstance() {
        if (singletonLazyEvaluationInstance == null) {
            singletonLazyEvaluationInstance = new SingletonLazyEvaluation();
        }
        return singletonLazyEvaluationInstance;
    }
}


// Notes
// Not thread Safe
// 2 Different Threads can create 2 different Instance of SingleTon class
// Recommended with use cases where class is stateless or no resource initialisation takes safe