package pl.sdacademy.designPatterns.duck.strategy;

public class Drifting implements Swimming {
    @Override
    public void swim() {
        System.out.println("I'm drifting ");
    }
}
