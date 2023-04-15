package safaryzone.controller.menu.capture;

import safaryzone.controller.menu.capture.controller.CaptureController;
import safaryzone.pokemon.pokemon.Pokemon;
import safaryzone.user.Player;

public class CaptureTestMain {
    public static void main(String[] args) {
         // <- test -> //
        System.out.println(Player.getInstance().getInventory().getBallPouch().getBallList());

        StringBuilder myPokemonListInformation = new StringBuilder();
        for (Pokemon pokemon : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (pokemon != null)
                myPokemonListInformation.append(pokemon.getInformation().toString());
        }
        System.out.println(myPokemonListInformation);

        new CaptureController().start();

        System.out.println(Player.getInstance().getInventory().getBallPouch().getBallList());

        myPokemonListInformation = new StringBuilder();
        for (Pokemon pokemon : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (pokemon != null) {
                myPokemonListInformation.append(pokemon.getInformation().toString());
            }
        }

        System.out.println(myPokemonListInformation);
        // <- test -> //
    }
}
