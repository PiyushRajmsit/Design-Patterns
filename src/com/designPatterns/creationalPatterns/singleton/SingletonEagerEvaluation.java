package com.designPatterns.creationalPatterns.singleton;

public class SingletonEagerEvaluation {

    private static SingletonEagerEvaluation singletonEagerEvaluationInstance = new SingletonEagerEvaluation();

    private SingletonEagerEvaluation() {
    }

    public static SingletonEagerEvaluation getInstance() {
        return singletonEagerEvaluationInstance;
    }
}

// Notes
// Thread Safe
// Disadvantage is that even created when class is not used
