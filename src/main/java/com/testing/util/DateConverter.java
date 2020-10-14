package com.testing.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

public class DateConverter {
    private static final String MY_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat MY_DATE_FORMAT = new SimpleDateFormat(MY_DATE_PATTERN);

    public String convertDateEpochToDateString(long dateMillis) {
        // Create some logic to check that the date passed in is neither greater than the current date
        // nor less than the current date - 1 day
        long currentDateMillis = System.currentTimeMillis();

        if (dateMillis > currentDateMillis) {
            throw new DateTimeException("Passed date is greater than the current date");
        } else if (dateMillis < currentDateMillis - 86400000) {
            throw new DateTimeException("Passed date is less than the current date minus 1 day");
        } else {
            return MY_DATE_FORMAT.format(dateMillis);
        }
    }

    public Date convertStringToDate(String dateString) throws ParseException {
        return MY_DATE_FORMAT.parse(dateString);
    }
}
