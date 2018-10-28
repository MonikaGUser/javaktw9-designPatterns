package pl.sdacademy.designPatterns.duck;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DuckStatisticsTest {
 /*   @Test

    public void shouldAcceptDuckListAsParameter() {
        //given
        List<duck> ducks = new ArrayList<>();
        //when
        new DuckStatistics(ducks);
        //then
//nothing
    }*/
@Test
    public void shouldReturnOldestDuck() {
        // Given
        Duck duck1 = mock(Duck.class);
        when(duck1.age()).thenReturn(15);

        Duck oldestDuck = mock(Duck.class);
        doReturn(555).when(oldestDuck).age();

        Duck duck3 = mock(Duck.class);
        doReturn(7).when(duck3).age();
        List<Duck> ducks = new ArrayList<>();
        ducks.add(duck1);
        ducks.add(oldestDuck);
        ducks.add(duck3);
        DuckStatistics duckStatistics = new DuckStatistics(ducks);
        // When
        Integer age = duckStatistics.getOldestDuckAge();
        // Then
        Assert.assertEquals((Integer) 555, age);


    }
}
