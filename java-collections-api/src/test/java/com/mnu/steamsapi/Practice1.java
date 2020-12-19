package com.mnu.steamsapi;


import com.google.common.collect.ImmutableList;

import com.mnu.common.beans.Person;
import com.mnu.common.sampledata.MockData;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class Practice1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people

  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

    List<Person> youngPeople =MockData.getPeople().stream()
            .filter(person -> person.getAge()<=18)
            .limit(10)
            .collect(Collectors.toList());
    //youngPeople.forEach(System.out::println);
      MockData.getPeople().stream()
            .filter(person -> person.getAge()<=18)
            .limit(10)
            .collect(Collectors.toList())
            .forEach(System.out::println);
  }
}
