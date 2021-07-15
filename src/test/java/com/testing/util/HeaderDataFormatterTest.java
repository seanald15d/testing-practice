package com.testing.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HeaderDataFormatterTest {
    private HeaderDataFormatter headerDataFormatter;

    @BeforeEach
    void init() {
        headerDataFormatter = new HeaderDataFormatter();
    }

    @Test
    @DisplayName("Test game id in bounds of Final Fantasy returns FF alias")
    void testGetGameAliasFFGameId() {
        String response = headerDataFormatter.getGameAlias(2);
        Assertions.assertEquals("Final Fantasy", response);
    }

    @Test
    @DisplayName("Test game id out of bounds of known games returns empty string")
    void testGetGameAliasUnknownGameId() {
        // TODO - update test
        Assertions.fail("Not implemented");
    }
}
