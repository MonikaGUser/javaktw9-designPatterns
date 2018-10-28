package pl.sdacademy.designPatterns.duck;

import java.util.Comparator;
import java.util.List;

public class DuckStatistics {
    private List<Duck> ducks;

    public DuckStatistics(List<Duck> ducks) {
        this.ducks = ducks;
    }

  /*  public Integer getOldestDuckAge() {
        Integer oldestDuckAge = Integer.MAX_VALUE;
        for (duck duck: ducks){
            Integer duckAge = duck.age();
            if (duckAge>oldestDuckAge){
                oldestDuckAge = duckAge;
            }
        }
     return oldestDuckAge;
    }*/
  public Integer getOldestDuckAge (){
      return ducks.stream()
              .sorted(Comparator.comparing(Duck::age).reversed())
              .findFirst().map(Duck::age).orElse(Integer.MIN_VALUE);
  }
}
