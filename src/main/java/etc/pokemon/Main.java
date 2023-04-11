package etc.pokemon;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * 포켓몬 리스트 생성
         */
        List<Pokemon> pokemonList = new PokemonList().getPokemonList();
        for (Pokemon pokemon : pokemonList) {
            System.out.println("pokemon = " + pokemon);
        }

    }
}
