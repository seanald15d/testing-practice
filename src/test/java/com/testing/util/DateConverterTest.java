package com.testing.util;

import org.junit.jupiter.api.*;

import java.text.ParseException;
import java.time.DateTimeException;

class DateConverterTest {

    private DateConverter dateConverter;

    @BeforeEach
    void init() {
        dateConverter = new DateConverter();
    }

    // TODO: Add tests for DateTimeException
    @Test
    @DisplayName("Test DateTimeException for too long ago date")
    void testConvertDateEpochToDateStringPastError() {

    }

    @Test
    @DisplayName("Test DateTimeException for date too far in future")
    void testConvertDateEpochToDateStringFutureError() {

    }

    // TODO: Add test for badly formatted date string
    @Test
    @DisplayName("Test ParseException for bad formatted date")
    void testConvertStringToDateThrowsError() {

    }
}
