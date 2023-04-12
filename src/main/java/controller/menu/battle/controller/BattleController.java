package controller.menu.battle.controller;

import controller.menu.battle.view.InputView;
import controller.menu.battle.view.OutputView;

public class BattleController {

    private final OutputView outputView;
    private final InputView inputView;

    public BattleController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }


    public void start() {

        System.out.println("포켓몬 전투가 시작 됩니다.");
        System.out.println("잠시 뒤 포켓몬스터가 등장합니다.");
        System.out.println("야생의 꼬부기가 등장하였습니다.");
        System.out.println("메뉴를 선택해주세요");
        System.out.println("1. 내 포켓몬 꺼내기");
        System.out.println("2. 도망가기");
        String inputMenu = inputView.battleMenu();
        switch (inputMenu) {
            case "1":
                // 싸우기
                goMyPokemon();
                break;
            case "2":
                // 도망가기
                System.out.println("\n도망가기를 선택하였습니다. !! \n");
                return;
        }


    }

    private void goMyPokemon() {
        System.out.println("포켓몬을 꺼냈습니다.");
        System.out.println("가라 꼬부기");
    }

}