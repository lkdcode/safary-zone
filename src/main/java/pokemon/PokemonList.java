package pokemon;

import common.MakeCommon;
import pokemon.books.NormalPokemonBooks;
import pokemon.pokemon.Pokemon;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 포켓몬 리스트를 관리할 클래스입니다.
 */
public class PokemonList implements Serializable {
    protected final Map<Integer, Pokemon> pokemonList;

    public PokemonList() {
        this.pokemonList = new HashMap<>();
        initialize();
    }

    public Map<Integer, Pokemon> playerPokemonList() {
        return pokemonList;
    }


    public void evolution(int bookNumber, Pokemon pokemon) {
        this.pokemonList.put(bookNumber, pokemon);
    }

    /**
     * 유저의 포켓몬리스트의 bookNumber(key) 를 입력해주고 null 로 초기값을 넣어줍니다.
     * NormalPokemon 리스트 중 무작위 포켓몬 하나를 추가로 넣어줍니다.
     * Player 는 하나의 포켓몬스터를 가지고 게임을 시작합니다.
     */
    private void initialize() {
        for (NormalPokemonBooks pokemon : NormalPokemonBooks.values()) {
            pokemonList.put(pokemon.getInformation().getBookNumber(), null);
        }
        int index = (int) MakeCommon.getRandom(1, NormalPokemonBooks.values().length);
        pokemonList.put(index, NormalPokemonBooks.values()[index - 1]);
    }

}
