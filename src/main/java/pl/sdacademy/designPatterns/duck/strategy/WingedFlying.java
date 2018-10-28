package pl.sdacademy.designPatterns.duck.strategy;

public class WingedFlying implements Flying {
    @Override
    public void fly() {
        System.out.println("I'm using wings and flying.");
    }
}
