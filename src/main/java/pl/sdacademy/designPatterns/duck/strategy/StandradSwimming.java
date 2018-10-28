package pl.sdacademy.designPatterns.duck.strategy;

public class StandradSwimming implements Swimming {
    @Override
    public void swim() {
        System.out.println("I'm using fins and swimming.");
    }
}
