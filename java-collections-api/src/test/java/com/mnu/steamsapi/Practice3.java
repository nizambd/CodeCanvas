package com.mnu.steamsapi;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class Practice3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    //approcah A
    Integer min = numbers.stream()
            .min((num1,num2)->num1>num2?1:-1)
            .get();
    //approach B
    Integer min1 = numbers.stream()
            .min(Comparator.naturalOrder())
            .get();
    assertThat(min).isEqualTo(1);
    System.out.println(min);


  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer max = numbers.stream()
            .min((num1,num2)->num1<num2?1:-1)
            .get();
    //approach B
    Integer max1 = numbers.stream()
            .min(Comparator.naturalOrder())
            .get();
    assertThat(max).isEqualTo(100);
    System.out.println(max1);

  }
}
