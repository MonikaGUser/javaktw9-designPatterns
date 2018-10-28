package pl.sdacademy.designPatterns.duck;

import pl.sdacademy.designPatterns.duck.strategy.*;

import java.util.Random;

public class MallardDuck implements Duck {


    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;
    private DuckCoop coop;
    private DuckEgg egg;
    private Integer eggCount;


    public MallardDuck() {
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new StandradSwimming();
        eggCount = 0;
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
       //zwracac faktyczna liczbe zniesionych jaj
        return eggCount;

    }

    @Override
    public Integer age() {
        return new Random().nextInt(100);
    }

    @Override
    public DuckEgg layEgg() {//stworzyć jajo i poinformowac kacznik o jaju i zwrócić jajo

        DuckEgg.Builder eggBuilder = new DuckEgg.Builder();
        eggBuilder.setYolkWeight(26D);
        DuckEgg egg = eggBuilder.build();
        eggCount++;
        coop.notifyAboutEgg(egg);
        return egg;
    }

    @Override
    public void walkToDuckCoop(DuckCoop coop) {
        coop.register(this);
        this.coop = coop;
    }

    @Override
    public void notify(DuckEgg egg) {
        String duckType = this.getClass().getSimpleName();
        System.out.println(duckType+ ": Nice egg!");
        //wyświetlic pochwalę

    }
}

