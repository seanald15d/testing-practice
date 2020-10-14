package com.testing.resource;

import com.testing.service.TestingService;

import java.util.List;

public class TestingResource {

    private TestingService service;

    public TestingResource(TestingService service) {
        this.service = service;
    }

    public List<String> doDataRetrieval(String accessingUser) throws IllegalAccessException {
        if (!accessingUser.equals("admin")) {
            throw new IllegalAccessException("Not allowed");
        } else {
            return service.getStuffWithLengthLessThanFive();
        }
    }
}
