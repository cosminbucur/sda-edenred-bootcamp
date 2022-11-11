package com.sda.advanced.tdd.junit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Junit5ExceptionTest {

    @Test
    void testHappyPath() {
        int actual = Integer.parseInt("1");

        assertThat(actual).isEqualTo(1);
    }

    @Test
    void testExpectedException() {

        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    void testExpectedExceptionWithSuperType() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    void testExpectedExceptionFail() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("1");
        });
    }

}
