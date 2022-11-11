package com.sda.advanced.tdd.junit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class Junit5ParameterizedTest {

    // multiple values
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 15, -9})
    void shouldBeDivisibleByThree(int number) {
        assertThat(UtilityClass.isDivisibleByThree(number)).isTrue();
    }

    // null and empty
    @ParameterizedTest
    @EmptySource
    @NullSource
    @ValueSource(strings = {" "})
    void shouldReturnTrueForNullEmptyAndBlankStrings(String text) {
        assertThat(text == null || text.trim().isEmpty()).isTrue();
    }

    // enum
    @ParameterizedTest
    @EnumSource(
            value = Day.class,
            names = {"SATURDAY", "SUNDAY"}
    )
    void shouldBeWeekend(Day day) {
        assertThat(MyCalendar.isWeekend(day)).isTrue();
    }

    // multiple arguments
    @ParameterizedTest
    @MethodSource("numberToMonth")
    void shouldReturnMonthName(int monthNumber, String monthName) {
        assertThat(MyCalendar.getMonthName(monthNumber)).isEqualTo(monthName);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/shopping.csv")
    void readShoppingList(String item, Integer price) {
        assertThat(price <= 50).isTrue();
        System.out.println(item + " = " + price);
    }

    private static Stream<Arguments> numberToMonth() {
        return Stream.of(
                Arguments.arguments(1, "Jan"),
                Arguments.arguments(6, "Jun"),
                Arguments.arguments(12, "Dec")
        );
    }

}
