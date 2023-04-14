package controller.menu.battle.controller;

import pokemon.books.FinallyPokemonBooks;
import pokemon.books.NormalPokemonBooks;
import pokemon.books.RarePokemonBooks;
import pokemon.pokemon.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class WildPokemonList {
    private final Map<Integer, Pokemon> NORMAL_POKEMON_LIST;
    private final Map<Integer, Pokemon> RARE_POKEMON_LIST;
    private final Map<Integer, Pokemon> FINALLY_POKEMON_LIST;

    public WildPokemonList() {
        this.NORMAL_POKEMON_LIST = new HashMap<>();
        this.RARE_POKEMON_LIST = new HashMap<>();
        this.FINALLY_POKEMON_LIST = new HashMap<>();
        initialize();
    }


    private void initialize() {
        for (NormalPokemonBooks normalPokemon : NormalPokemonBooks.values()) {
            this.NORMAL_POKEMON_LIST.put(normalPokemon.getInformation().getBookNumber(), normalPokemon);
        }

        for (RarePokemonBooks rarePokemon : RarePokemonBooks.values()) {
            this.RARE_POKEMON_LIST.put(rarePokemon.getInformation().getBookNumber(), rarePokemon);
        }

        for (FinallyPokemonBooks finallyPokemon : FinallyPokemonBooks.values()) {
            this.FINALLY_POKEMON_LIST.put(finallyPokemon.getInformation().getBookNumber(), finallyPokemon);
        }
    }

    public Map<Integer, Pokemon> getNORMAL_POKEMON_LIST() {
        return NORMAL_POKEMON_LIST;
    }

    public Map<Integer, Pokemon> getRARE_POKEMON_LIST() {
        return RARE_POKEMON_LIST;
    }

    public Map<Integer, Pokemon> getFINALLY_POKEMON_LIST() {
        return FINALLY_POKEMON_LIST;
    }


}
