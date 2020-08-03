package com.github.dertseha.codingdojo;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleClassTest {
    @Test
    public void testExample() {
        final SimpleClass simple = new SimpleClass("1234");

        assertThat(simple.getValue(), Matchers.is("1234"));
    }
}
