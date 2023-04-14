package controller.menu.capture.service;

import static common.MakeCommon.*;

import controller.menu.battle.controller.WildPokemonList;
import controller.menu.battle.service.SummonServiceLogic;
import pokemon.pokemon.Pokemon;
import user.Player;

import java.util.Collection;

public class CaptureServiceLogic {
    //여기서 총괄 관리
    private final Pokemon wildPokemon;
    private Double captureRate;
    private Double runAwayRate;

    public CaptureServiceLogic() {
        this.wildPokemon = new SummonServiceLogic().getWhildPokemon();
    }
    //여기서 야생 포켓몬이 생성되어 있음


    //야생 포켓몬 생성 호출 : CaptureServiceLogic();
    //포획확률
    //다가갈 경우 도망갈 확률

    public void throwBall(){

        //포획률 계산


        System.out.println("볼을 던진다");
    }

    private String validateBallQuantity(){
        //해당 메서드에서 유저가 현재 보유하고 있는 몬스터볼의 정보만 리턴
        Collection<Integer> values = Player.getInstance().getInventory().getBallPouch().getBallPouch().values();

        return null;
    }

}
