package com.testing.service;

import com.testing.repository.TestingRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class TestingServiceTest {

    @Mock
    TestingRepository repository;

    @InjectMocks
    TestingService service;

    @Test
    void testSuccess() throws SQLException {
        // Setup mock scenario
        Mockito.when(repository.getStuff()).thenReturn(Arrays.asList("A", "B", "CDEFGHIJK", "12345", "1234"));

        // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanFive();

        // Validate the response
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(3, stuff.size());
    }

    @Test
    void testException() throws SQLException {
        // Setup mock scenario
        Mockito.when(repository.getStuff()).thenThrow(new SQLException("Connection Exception"));

        // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanFive();

        // Validate the response
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(0, stuff.size());
    }

}
