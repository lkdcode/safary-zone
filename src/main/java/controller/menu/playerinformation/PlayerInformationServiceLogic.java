package controller.menu.playerinformation;


import pokemon.pokemon.Pokemon;
import user.Inventory;
import user.Player;
import user.item.ball.MonsterBall;

import java.util.Map;

public class PlayerInformationServiceLogic {

    public PlayerInformationServiceLogic() {

    }
    // player getPokemonList -> map<>
    // map iter 반복문 가능
    // .keySet() 키를 뱉어요
    // 이 키를 기준으로 (1~12)
    // Player.getPokemonList -> map().get(key)
    // return Pokemon; 없으면 null;
    // != null  포켓몬이 존재하기때무넹
    // String += pokemon.toString();

    public String playerPokemonList() {
        StringBuilder playerPokemonList= new StringBuilder();
        Map<Integer, Pokemon> pokemonList = Player.getInstance().getPokemonList().playerPokemonList();
        for (Pokemon pokemon : pokemonList.values()) {
            if(pokemon!=null){
                playerPokemonList.append(pokemon.getInformation().toString());
            }

        }
        return String.valueOf(playerPokemonList);
    }
//    public String playerBallList(){
//        StringBuilder playerBallList = new StringBuilder();
//        Map<MonsterBall, Integer> ballList = Player
//    }

}
