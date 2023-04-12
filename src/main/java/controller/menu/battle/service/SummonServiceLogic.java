package controller.menu.battle.service;

import controller.menu.battle.controller.WildPokemonList;
import pokemon.books.FinallyPokemonBooks;
import pokemon.books.NormalPokemonBooks;
import pokemon.books.RarePokemonBooks;
import pokemon.pokemon.Pokemon;
import user.Player;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * 야생의 포켓몬을 소환하는 클래스
 */
public class SummonServiceLogic {
    private final int LOW_LEVEL = 3;
    private final int HIGH_LEVEL = 8;
    private final int RATE_RANGE_MAX = 100;
    private final int RATE_RANGE_MIN = 1;
    private final int MIN_BOOK_NUMBER = 1;
    private WildPokemonList wildPokemonList = new WildPokemonList();

    public SummonServiceLogic() {
    }

    public Pokemon getWhildPokemon() {
        int playerLevel = Player.getInstance().getLevel();

        if (playerLevel <= LOW_LEVEL) return lowLevelSummon();
        if (playerLevel >= HIGH_LEVEL) return highLevelSummon();
        else return middleLevelSummon();
    }

    private Pokemon lowLevelSummon() {
        if (random(RATE_RANGE_MIN, RATE_RANGE_MAX) >= 99.9) return finallyPokemonRandomPick();
        if (random(RATE_RANGE_MIN, RATE_RANGE_MAX) <= 5.0) return rarePokemonRandomPick();
        else return normalPokemonRandomPick();
    }

    private Pokemon middleLevelSummon() {
        if (random(RATE_RANGE_MIN, RATE_RANGE_MAX) >= 89.9) return finallyPokemonRandomPick();
        if (random(RATE_RANGE_MIN, RATE_RANGE_MAX) <= 11.0) return rarePokemonRandomPick();
        else return normalPokemonRandomPick();
    }

    private Pokemon highLevelSummon() {
        if (random(RATE_RANGE_MIN, RATE_RANGE_MAX) >= 70.0) return finallyPokemonRandomPick();
        if (random(RATE_RANGE_MIN, RATE_RANGE_MAX) <= 11.0) return normalPokemonRandomPick();
        else return rarePokemonRandomPick();
    }

    private Pokemon normalPokemonRandomPick() {
        int normalBookSize = NormalPokemonBooks.values().length;
        int index = (int) random(MIN_BOOK_NUMBER, normalBookSize);

        return wildPokemonList.getNORMAL_POKEMON_LIST().get(index);
    }

    private Pokemon rarePokemonRandomPick() {
        int rareBookSize = RarePokemonBooks.values().length;
        int index = (int) random(MIN_BOOK_NUMBER, rareBookSize);

        return wildPokemonList.getRARE_POKEMON_LIST().get(index);
    }

    private Pokemon finallyPokemonRandomPick() {
        int finallyBookSize = FinallyPokemonBooks.values().length;
        int index = (int) random(MIN_BOOK_NUMBER, finallyBookSize);

        return wildPokemonList.getFINALLY_POKEMON_LIST().get(index);
    }

    private double random(int minRange, int maxRange) {
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            return (instanceStrong.nextDouble() * maxRange) + minRange;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return (Math.random() * maxRange) + minRange;
    }

}