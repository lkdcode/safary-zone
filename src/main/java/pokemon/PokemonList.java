package pokemon;

import pokemon.books.NormalPokemonBooks;
import pokemon.pokemon.Pokemon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 포켓몬 리스트를 관리할 클래스입니다.
 */
public class PokemonList {
    protected final Map<Integer, Pokemon> pokemonList;

    public PokemonList() {
        this.pokemonList = new HashMap<>();
        initialize();
    }

    public Map<Integer, Pokemon> getPokemonList() {
        return pokemonList;
    }

    private void initialize() {
        for (NormalPokemonBooks pokemon : NormalPokemonBooks.values()) {
            pokemonList.put(pokemon.getInformation().getBookNumber(), null);
        }
        pokemonList.put(1, NormalPokemonBooks.GGOBUGI);
    }

}
