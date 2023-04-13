package controller.menu.battle.controller;

import controller.menu.battle.service.SummonServiceLogic;
import controller.menu.battle.view.InputView;
import controller.menu.battle.view.OutputView;
import pokemon.books.NormalPokemonBooks;
import pokemon.pokemon.Pokemon;

/**
 * 야생 포켓몬과 배틀 컨텐츠를 관리하는 클래스
 */
public class BattleController {
    private final FightController fightController;
    private final SummonServiceLogic summonServiceLogic;
    private final OutputView outputView;
    private final InputView inputView;

    public BattleController() {
        this.fightController = new FightController();
        this.summonServiceLogic = new SummonServiceLogic();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }


    public void start() {
        System.out.println("포켓몬 전투가 시작 됩니다.");
        System.out.println("잠시 뒤 포켓몬스터가 등장합니다.");
        System.out.println("야생의 꼬부기가 등장하였습니다.");

        while (true) {
            System.out.println("메뉴를 선택해주세요");
            System.out.println("1. 내 포켓몬 꺼내기");
            System.out.println("2. 도망가기");

            String inputMenu = inputView.battleMenu();
            switch (inputMenu) {
                case "1":
                    // 싸우기
                    setMyPokemon();

                    break;
                case "2":
                    // 도망가기
                    System.out.println("\n도망가기를 선택하였습니다. !! \n");
                    return;
            }

        }
    }

    private void setMyPokemon() {
        System.out.println("선택할 포켓몬");
        System.out.println("꼬부기를 선택하였습니다.");
        goMyPokemon();
    }

    private void goMyPokemon() {
        System.out.println("포켓몬을 꺼냈습니다.");
        System.out.println("가라 꼬부기");
        // TODO : 야생 포켓몬이 랜덤으로 선택돼서 매개변수로 전달.
        //       플레이어가 고른 포켓몬을 매개변수로 전달.

//        fightController.readyFight(choiceMyPokemon(), summonServiceLogic.getWhildPokemon());
        fightController.readyFight(NormalPokemonBooks.GGOBUGI, NormalPokemonBooks.PYREE);
    }

    private Pokemon choiceMyPokemon() {
        // 현재 플레이어가 보유한 포켓몬스터 목록을 보여줍니다.
        // 목록을 보여줄 때 소환 번호와 이름, 간단한 내용만 보여주기

        // 1. 상세보기 기능
        // -->
        // 2. 소환 기능
        // 3. 도망가기 기능

        //
        return null;
    }

}