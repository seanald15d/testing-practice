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

    @Nested
    class ConvertDateEpochToString {
        @Test
        @DisplayName("Test DateTimeException for too long ago date")
        void testConvertDateEpochToDateStringPastError() {
            Assertions.assertThrows(DateTimeException.class, () -> dateConverter.convertDateEpochToDateString(12335436L));
        }

        @Test
        @DisplayName("Test DateTimeException for date too far in the future")
        void testConvertDateEpochToDateStringFutureError() {
            Assertions.assertThrows(DateTimeException.class, () -> dateConverter.convertDateEpochToDateString(System.currentTimeMillis() + 86400000));
        }
    }

    @Test
    @DisplayName("Test parse exception for badly formatted date")
    void testConvertStringToDateThrowsError() {
        Assertions.assertThrows(ParseException.class, () -> dateConverter.convertStringToDate("2016-01-31 23:59"));
    }
}
