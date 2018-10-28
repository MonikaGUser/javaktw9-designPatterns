package pl.sdacademy.designPatterns.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckCoop {
    private List<Duck> ducks;
    public DuckCoop (){
        ducks = new ArrayList<>();
    }

    public void register(Duck duck) {
       ducks.add(duck); // zapisz kaczke w liscie kaczek
    }

    public void unregister(Duck duck) {
        ducks.remove(duck); //usun z listy
    }

    public void notifyAboutEgg(DuckEgg egg) {

     //  for (Duck duck : ducks) {
         //   duck.notify(egg);
            //pionformowac za pomoca notify o nowym jaju
      //  }
        ducks.forEach(duck -> duck.notify(egg));
    }

}