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
            Mockito.when(service.getStuffWithLengthLessThanFive()).thenReturn(Arrays.asList("A", "B", "1234"));

            List<String> response = resource.doDataRetrieval("admin");

            Assertions.assertNotNull(response);
            Assertions.assertEquals(3, response.size());
        }

        @Test
        void testThrowsIllegalAccess() {
            Assertions.assertThrows(IllegalAccessException.class, () -> resource.doDataRetrieval("user"));
        }
    }
}
