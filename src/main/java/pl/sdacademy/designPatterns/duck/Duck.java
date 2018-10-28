package pl.sdacademy.designPatterns.duck;

public interface Duck {

     void quack ();
     void fly();
     void swim ();
Integer totalEggsLaid();
Integer age ();
DuckEgg layEgg ();
void walkToDuckCoop (DuckCoop coop);
void notify (DuckEgg egg);


}
