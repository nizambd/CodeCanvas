package com.mnu.steamsapi;


import com.mnu.common.beans.Person;
import com.mnu.common.sampledata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class Practice2 {

  @Test
  public void range() throws Exception {

    for (int i = 0; i <10 ; i++) {
      System.out.print(i);
    }
    System.out.println(" - Regular");
   // IntStream.range(0,10).forEach(index-> System.out.println(index));
    //or
    IntStream.range(0,10).forEach(System.out::print);
    System.out.println("- Exclusive");
    IntStream.rangeClosed(0,10).forEach(System.out::print);
    System.out.println("- Inclusive");

  }
  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    System.out.println("Plain Output");
    for (Person person : people) {
      System.out.println(person);
    }
    // or
    people.forEach(System.out::println);
    System.out.println("This one when you need index");
    IntStream.range(0,people.size())
            .forEach(index->{
              Person person =people.get(index);
              System.out.println(person);
            });

  }

  @Test
  public void intStreamIterate() throws Exception {
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
  }
}
