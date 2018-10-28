package pl.sdacademy.designPatterns.duck.strategy;

public class StandardQuacking implements Quacking {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
