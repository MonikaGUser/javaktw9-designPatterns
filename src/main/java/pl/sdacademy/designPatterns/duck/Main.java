package pl.sdacademy.designPatterns.duck;

import pl.sdacademy.designPatterns.duck.singleton.FarmerEagerSingleton;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck greenWingedTealDuck = new GreenWingedTealDuck();
        mallardDuck.fly();
        mallardDuck.swim();
        mallardDuck.quack();
        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.quack();
        greenWingedTealDuck.fly();
        greenWingedTealDuck.swim();
        greenWingedTealDuck.quack();
DuckEgg.Builder builder = new DuckEgg.Builder();
builder.setYolkWeight(28D);
DuckEgg egg = builder.build();
        System.out.println(egg);

        Fodder.Builder fodderBuilder = Fodder.builder(500, 500);
        Fodder fodder = fodderBuilder
                .minerals(true)
                .triticaleGrams(321)
                .build();

        FarmerEagerSingleton farmer = FarmerEagerSingleton.getInstance();
        farmer.askVet();
        System.out.println("==============");
        farmer.askVet();
        DuckCoop duckCoop = new DuckCoop();
        mallardDuck.walkToDuckCoop(duckCoop);
        greenWingedTealDuck.walkToDuckCoop(duckCoop);
        mallardDuck.layEgg();

    }
}
