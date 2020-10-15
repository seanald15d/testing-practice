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

    // TODO: Add tests for succses and illegal access cases
}
