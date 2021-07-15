package com.testing.util;

import java.util.Arrays;
import java.util.List;

public class HeaderDataFormatter {
    private static final List<Integer> FINAL_FANTASY_ID_LIST = Arrays.asList(1, 2, 3, 4, 5);
    private static final List<Integer> KINGDOM_HEARTS_ID_LIST = Arrays.asList(6, 7, 8, 9, 10);

    public String getGameAlias(int gameId) {
        String gameAlias = "";
        if (gameId < 11 && FINAL_FANTASY_ID_LIST.contains(gameId)) {
            gameAlias = "Final Fantasy";
        }
        else if (KINGDOM_HEARTS_ID_LIST.contains(gameId)) {
            gameAlias = "Kingdom Hearts";
        }

        return gameAlias;
    }
}
