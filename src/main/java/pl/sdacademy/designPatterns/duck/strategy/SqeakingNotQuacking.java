package pl.sdacademy.designPatterns.duck.strategy;

public class SqeakingNotQuacking implements Quacking {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
