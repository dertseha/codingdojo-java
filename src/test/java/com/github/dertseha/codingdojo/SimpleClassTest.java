package com.github.dertseha.codingdojo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class SimpleClassTest {
    @Test
    public void testExample() {
        final SimpleClass simple = new SimpleClass("1234");

        Assert.assertThat(simple.getValue(), Matchers.is("1234"));
    }
}
