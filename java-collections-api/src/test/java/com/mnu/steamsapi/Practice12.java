package com.mnu.steamsapi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mnu.common.beans.Person;
import com.mnu.common.sampledata.MockData;
import org.junit.Test;

public class Practice12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
            ArrayList::new,
            ArrayList::add,
            (list1, list2) -> list1.addAll(list2));
//        .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
