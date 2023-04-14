package controller.menu.battle.controller;

import controller.menu.battle.exception.ErrorMessageBattle;
import controller.menu.battle.service.SummonServiceLogic;
import controller.menu.battle.view.InputView;
import controller.menu.battle.view.OutputView;
import pokemon.pokemon.Pokemon;
import user.Player;

/**
 * 야생 포켓몬과 배틀 컨텐츠를 관리하는 클래스
 */
public class BattleController {
    private final FightController fightController;
    private final OutputView outputView;
    private final InputView inputView;
    private SummonServiceLogic summonServiceLogic;
    private Pokemon wildPokemon;

    public BattleController() {
        this.fightController = new FightController();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void start() {
        this.summonServiceLogic = new SummonServiceLogic();
        this.wildPokemon = summonServiceLogic.getWhildPokemon();
        String wildPokemonName = wildPokemon.getInformation().getName();
        outputView.appearWildPokemon(wildPokemonName);

        while (true) {
            outputView.choiceMenu();
            String inputMenu = inputView.battleMenu();

            switch (inputMenu) {
                case "1":
                    // 싸우기
                    outputView.inputFight();
                    setMyPokemon();
                    if (fightController.isWon()) return;
                    break;
                case "2":
                    // 도망가기
                    outputView.inputRun();
                    return;
                default:
                    outputView.show(ErrorMessageBattle.INPUT_MENU.getMessage());
            }

        }
    }

    /**
     * 플레이어의 포켓몬을 선택하는 메서드
     */
    private void setMyPokemon() {
        showMyPokemonList();
        choiceListMenu();
    }

    private void showMyPokemonList() {
        outputView.choiceMyPokemon();
        StringBuilder myPokemonListInformation = new StringBuilder();
        for (Pokemon pokemon : Player.getInstance().getPokemonList().playerPokemonList().values()) {
            if (pokemon != null)
                myPokemonListInformation.append(pokemon.getInformation().toString());
        }
        outputView.showMyPokemonInformation(myPokemonListInformation.toString());
    }


    private void choiceListMenu() {
        while (true) {
            outputView.showSummon();
            String inputMyPokemonName = inputView.choiceMyPokemon();

            for (Pokemon myPokemon : Player.getInstance().getPokemonList().playerPokemonList().values()) {
                if (myPokemon != null) {
                    if (myPokemon.getInformation().getName().equals(inputMyPokemonName)) {
                        goMyPokemon(myPokemon);
                        return;
                    }
                }
            }

            outputView.show(ErrorMessageBattle.INPUT_MY_POKEMON_NAME.getMessage());
            showMyPokemonList();
        }
    }

    /**
     * 가라 꼬부기를 담당하는 메서드
     */
    private void goMyPokemon(Pokemon playerPokemon) {
        String playerPokemonName = playerPokemon.getInformation().getName();
        outputView.goMyPokemon(playerPokemonName);
        fightController.readyFight(wildPokemon, playerPokemon);
    }

}