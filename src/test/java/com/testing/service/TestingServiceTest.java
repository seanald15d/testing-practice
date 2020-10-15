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

    // TODO: Follow the JUnit 5 tutorial part 3 to construct your service layer test
    // https://www.infoworld.com/article/3537563/junit-5-tutorial-part-1-unit-testing-with-junit-5-mockito-and-hamcrest.html?page=3

}
