package com.testing.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.DateTimeException;

class DateConverterTest {

    private DateConverter dateConverter;

    @BeforeEach
    void init() {
        dateConverter = new DateConverter();
    }

    @Test
    @DisplayName("Test DateTimeException for bad date param")
    void testConvertDateEpochToDateStringErrors() {
        Assertions.assertThrows(DateTimeException.class, () -> dateConverter.convertDateEpochToDateString(12335436L));
        Assertions.assertThrows(DateTimeException.class, () -> dateConverter.convertDateEpochToDateString(System.currentTimeMillis() + 86400000));
    }

    @Test
    @DisplayName("Test parse exception for badly formatted date")
    void testConvertStringToDateThrowsError() {
        Assertions.assertThrows(ParseException.class, () -> dateConverter.convertStringToDate("2016-01-31 23:59"));
    }
}
