package safaryzone.controller.menu.playerinformation.controller;

import safaryzone.controller.menu.playerinformation.service.PlayerInformationServiceLogic;
import safaryzone.controller.menu.playerinformation.view.InputView;
import safaryzone.controller.menu.playerinformation.view.OutputView;

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

    private final String INVENTORY_AND_INFORMATION_MENU = "1";
    private final String POKEMON_LIST_MENU = "2";
    private final String EXIT = "0";


    //내 정보로 들어옴

    // 1.인벤토리, 캐릭터 레벨  getlevel, getinventory
    // 2. 보유한 포켓몬 리스트  -> servicelogic
    // 3. 나가기


    public PlayerInformationController() {
        this.playerInformationServiceLogic = new PlayerInformationServiceLogic();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void start() {
        while (true) {
            outputView.showPlayerMenu();
            Scanner sc = new Scanner(System.in);

            String selectPlayerInformation = inputView.menu();


            switch (selectPlayerInformation) {
                case INVENTORY_AND_INFORMATION_MENU:
                    outputView.showPlayerInventory();
                    outputView.showPlayerLevel();
                    break;
                case POKEMON_LIST_MENU:
                    outputView.showPokemonList(playerInformationServiceLogic.playerPokemonList());
                    break;
                case EXIT:
                    outputView.backToMain();
//                    new SystemController().start(); TODO: 이렇게 되면 재귀적으로 계속 호출하게 됩니다. 그냥 리턴으로 해당 메서드를 종료시켜야해요.
                    return;
            }
        }

    }
}
