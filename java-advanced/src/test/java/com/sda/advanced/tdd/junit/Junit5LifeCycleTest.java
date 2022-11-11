package com.sda.advanced.tdd.junit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Junit5LifeCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll executed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach executed");
    }

    @Test
    void testOne() {
        System.out.println("======TEST ONE EXECUTED=======");
        assertThat(true).isTrue();
    }

    @Test
    void testTwo() {
        System.out.println("======TEST TWO EXECUTED=======");
        assertThat(true).isTrue();
    }

    @Disabled
    @Test
    void disabledTest() {
        System.out.println("======NO EXECUTION=======");
        assertThat(true).isTrue();
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach executed");
    }

}
