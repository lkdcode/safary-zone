package controller.menu.playerinformation.controller;

import controller.SystemController;
import controller.menu.playerinformation.PlayerInformationServiceLogic;
import controller.menu.playerinformation.view.InputView;
import controller.menu.playerinformation.view.OutputView;

import java.util.Scanner;

/**
 * 유저 정보 controller
 */
public class PlayerInformationController {
    //inputview
    //outputview
    private final OutputView outputView;
    private final InputView inputView;
    private final PlayerInformationServiceLogic playerInformationServiceLogic;


    //내 정보로 들어옴

    // 1.인벤토리, 캐릭터 레벨  getlevel, getinventory
    // 2. 보유한 포켓몬 리스트  -> servicelogic
    // 3. 나가기
//    fightoutputview

    //service로 호출?



    public PlayerInformationController() {
        this.playerInformationServiceLogic = new PlayerInformationServiceLogic();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        String selectPlayerInformation = sc.nextLine();
        //유효성 검사


        switch (selectPlayerInformation) {
            case "1":
                //인벤토리, 플레이어 레벨 보여줌
                break;
            case "2":
                outputView.showPokemonList(playerInformationServiceLogic.playerPokemonList());
                break;
            case "3":
                return;
        }


    }
}
