package com.testing.repository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestingRepository {

    public List<String> getStuff() throws SQLException {
        int rn = new Random().nextInt(3 - 1 + 1) + 1;
        if (rn == 2) {
            throw new SQLException("Connection Exception");
        }

        return Arrays.asList("One", "Two", "Three");
    }
}
