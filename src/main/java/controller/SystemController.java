package controller;

import View.InputView;
import View.OutputView;
import controller.menu.battle.controller.BattleController;
import controller.menu.capture.controller.CaptureController;
import controller.menu.ending.controller.EndingController;
import controller.menu.garden.controller.GardenController;
import controller.menu.playerinformation.controller.PlayerInformationController;
import controller.menu.shop.controller.ShopController;

/**
 * main controller
 */
public class SystemController {
    private final ShopController shopController;
    private final BattleController battleController;
    private final CaptureController captureController;
    private final GardenController gardenController;
    private final PlayerInformationController playerInformationController;
    private final EndingController endingController;
    private final OutputView outputView;
    private final InputView inputView;
    private final String SHOP_MENU = "1";
    private final String GARDEN_MENU = "2";
    private final String CAPTURE_MENU = "3";
    private final String BATTLE_MENU = "4";
    private final String INFORMATION_MENU = "5";
    private final String SAVE_MENU = "6";
    private final String EXIT_MENU = "7";
    private final String EXIT = "1";


    public SystemController() {
        this.shopController = new ShopController();
        this.battleController = new BattleController();
        this.captureController = new CaptureController();
        this.gardenController = new GardenController();
        this.playerInformationController = new PlayerInformationController();
        this.endingController = new EndingController();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void start() {
        outputView.welcome();

        while (true) {
            endingController.check();

            outputView.menu();
            String input = inputView.menu();

            switch (input) {
                case SHOP_MENU:
                    outputView.shop();
                    shopController.start();
                    break;
                case GARDEN_MENU:
                    outputView.garden();
                    gardenController.start();
                    break;
                case CAPTURE_MENU:
                    outputView.capture();
                    captureController.start();
                    break;
                case BATTLE_MENU:
                    outputView.battle();
                    battleController.start();
                    break;
                case INFORMATION_MENU:
                    outputView.information();
                    playerInformationController.start();
                    break;
                case SAVE_MENU:
                    outputView.save();
                    break;
                case EXIT_MENU:
                    outputView.isExit();
                    String inputExit = inputView.isExit();
                    if (inputExit.equals(EXIT)) {
                        outputView.exit();
                        System.exit(0);
                    }
            }

        }

    }
}
