package com.mnu.common.sampledata;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MockDataTest {

    @Test
    public void testGetPeople() throws Exception {
        System.out.println(MockData.getPeople().size());
        assertThat(MockData.getPeople()).hasSize(1000);
        //assertThat(1).isEqualTo(9);
    }
    @Test
    public void testGetCars() throws Exception {
        System.out.println( MockData.getPeople().size());
        assertThat(MockData.getCars()).hasSize(1000);
    }

}