package com.testing.repository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class TestingRepository {

    public List<String> getStuff() throws SQLException {

        return Arrays.asList("One", "Two", "Three");
    }
}
