package pl.sdacademy.designPatterns.duck.strategy;

public class FallingNotFlying implements Flying {
    @Override
    public void fly() {
        System.out.println("I'm falling down!");
    }
}
