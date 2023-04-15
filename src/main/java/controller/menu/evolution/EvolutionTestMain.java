package controller.menu.evolution;

import common.MakeCommon;
import controller.menu.evolution.controller.EvolutionController;
import pokemon.books.NormalPokemonBooks;
import pokemon.pokemon.Pokemon;
import user.Player;

public class EvolutionTestMain {
    public static void main(String[] args) {


        Pokemon test = NormalPokemonBooks.GGOBUGI;
        test.getInformation().setLevel(9);

        Player.getInstance().getPokemonList().playerPokemonList().put(3, test);
        for (Pokemon value : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (value != null) {
                System.out.println(value.getInformation().toString());
            }
        }

        MakeCommon.stopLine();
        new EvolutionController().start();

        System.out.println("=-----======================");

        for (Pokemon value : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (value != null) {
                System.out.println(value.getInformation().toString());
            }
        }

        for (Integer integer : Player.getInstance().getPokemonList().playerPokemonList().keySet()) {
            System.out.println("integer = " + integer);
        }

        for (Pokemon value : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            System.out.println("value = " + value);
        }


    }
}
