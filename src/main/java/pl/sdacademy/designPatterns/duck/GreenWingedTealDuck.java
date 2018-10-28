package pl.sdacademy.designPatterns.duck;

import pl.sdacademy.designPatterns.duck.strategy.*;

import java.util.Random;

public class GreenWingedTealDuck implements Duck {
    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public GreenWingedTealDuck (){
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new StandradSwimming();
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
        return new Random().nextInt(100);
    }

    @Override
    public Integer age() {
        return new Random().nextInt(100);
    }
}
