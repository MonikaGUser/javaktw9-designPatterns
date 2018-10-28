package pl.sdacademy.designPatterns.duck;

import pl.sdacademy.designPatterns.duck.strategy.*;

import java.util.Random;

public class RubberDuck implements Duck {
    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public RubberDuck() {
        quackingStrategy = new SqeakingNotQuacking();
        flyingStrategy = new FallingNotFlying();
        swimmingStrategy = new Drifting();
    }

    @Override
    public void quack() {
        quackingStrategy.quack();
    }

    @Override
    public void fly() {
        flyingStrategy.fly();
    }

    @Override
    public void swim() {
        swimmingStrategy.swim();
    }

    @Override
    public Integer totalEggsLaid() {
        return 0;
    }

    @Override
    public Integer age() {
        return new Random().nextInt(1000)+10;
    }
}