package safaryzone.controller.menu.ending.service;

import safaryzone.pokemon.books.LegendPokemonBooks;
import safaryzone.common.MakeCommon;
import safaryzone.user.Player;

public class EndingServiceLogic {

    private final int MAX_LEVEL = 10;
    private final int NOTHING = 0;


    public boolean check() {
        boolean isEnding = checkGarden() && checkLevel();
        if (isEnding) {
            getLegendPokemon();
            resetGarden();
        }

        return isEnding;
    }

    private void getLegendPokemon() {
        int legendBookSize = LegendPokemonBooks.values().length;
        int bookNumber = (int) MakeCommon.getRandom(1, legendBookSize);

        Player.getInstance().getPokemonList().playerPokemonList().put(
                bookNumber, LegendPokemonBooks.values()[bookNumber]
        );
    }

    private void resetGarden() {
        Player.getInstance().resetGarden();
    }


    private boolean checkLevel() {
        return Player.getInstance().getLevel() == MAX_LEVEL;
    }

    private boolean checkGarden() {
        int[][] checkGarden = Player.getInstance().getGarden().getCountMap();

        for (int i = 0; i < checkGarden.length; i++) {
            for (int j = 0; j < checkGarden[i].length; j++) {
                if (checkGarden[i][j] == NOTHING) return false;
            }
        }

        return true;
    }


}
