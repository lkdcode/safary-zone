package etc;

import etc.pokemon.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationExam {
    public static void main(String[] args) {
        Pokemon ggobugi = PokemonFactory.createPokemon(PokemonBooks.GGOBUGI);
        Pokemon pikachu = PokemonFactory.createPokemon(PokemonBooks.PICACHU);

        /**
         * List String 으로 담기
         */
        List<String> list = Stream.of(PokemonBooks.values())
                .map(Enum::name)
                .collect(Collectors.toList());

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        /**
         * List pokemon.Pokemon 으로 담기
         */
        List<Pokemon> list3 = new ArrayList<>();

        /**
         * Builder 패턴으로 생성하기
         */
        for (PokemonBooks value : List.of(PokemonBooks.values())) {
            list3.add(new PokemonInformation.Builder()
                    .name(value)
                    .hp(value.getHp())
                    .level(value.getLevel())
                    .build());
        }
        System.out.println("list3 = " + list3);

        /**
         * List.Of 로 List 로 담기
         */
        List<PokemonBooks> list1 = List.of(PokemonBooks.values());
        System.out.println("list1 = " + list1);

        /**
         * .values() 로 배열에 담기
         */
        PokemonBooks[] test = PokemonBooks.values();
        System.out.println("test.length = " + test.length);

        for (PokemonBooks pokeMonsters : test) {
            System.out.println("pokeMonsters = " + pokeMonsters);
        }

//        Set<Integer> test2 = new HashSet<>();
//        while (true) {
//            test2.add((int) (Math.random() * PokemonBooks.values().length));
//            System.out.println(test2);
//        }

        System.out.println("===================");
        PokemonList pokemonList = new PokemonList();
        for (Pokemon pokemon : pokemonList.getPokemonList()) {
            System.out.println(pokemon.toString());
        }
        System.out.println("===================");

    }
}