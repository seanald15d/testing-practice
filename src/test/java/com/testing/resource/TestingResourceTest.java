package com.testing.resource;

import com.testing.service.TestingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class TestingResourceTest {
    @Mock
    TestingService service;

    @InjectMocks
    TestingResource resource;

    @Nested
    class DoDataRetrieval {
        @Test
        void testSuccess() throws IllegalAccessException {
            // Setup mock scenario

            // Execute the resource method that uses the mocked service

            // Validate the response
        }

        @Test
        void testThrowsIllegalAccess() {
            // validate that bad input throws IllegalAccessException
        }
    }
}
