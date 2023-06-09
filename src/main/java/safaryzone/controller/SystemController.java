package safaryzone.controller;

import safaryzone.View.InputView;
import safaryzone.View.OutputView;
import safaryzone.controller.menu.battle.controller.BattleController;
import safaryzone.controller.menu.capture.controller.CaptureController;
import safaryzone.controller.menu.ending.controller.EndingController;
import safaryzone.controller.menu.evolution.controller.EvolutionController;
import safaryzone.controller.menu.garden.controller.GardenController;
import safaryzone.controller.menu.help.controller.HelpController;
import safaryzone.controller.menu.playerinformation.controller.PlayerInformationController;
import safaryzone.controller.menu.save.controller.SaveController;
import safaryzone.controller.menu.shop.controller.ShopController;

import java.io.File;

import static safaryzone.controller.menu.save.Path.PATH;

/**
 * main controller
 */
public class SystemController {
    private final ShopController shopController;
    private final BattleController battleController;
    private final CaptureController captureController;
    private final GardenController gardenController;
    private final EvolutionController evolutionController;
    private final PlayerInformationController playerInformationController;
    private final SaveController saveController;
    private final EndingController endingController;
    private final HelpController helpController;
    private final OutputView outputView;
    private final InputView inputView;
    private final String SHOP_MENU = "1";
    private final String GARDEN_MENU = "2";
    private final String CAPTURE_MENU = "3";
    private final String BATTLE_MENU = "4";
    private final String EVOLUTION_MENU = "5";
    private final String INFORMATION_MENU = "6";
    private final String SAVE_MENU = "7";
    private final String HELP_MENU = "8";
    private final String EXIT_MENU = "0";
    private final String EXIT = "1";


    public SystemController() {
        this.shopController = new ShopController();
        this.battleController = new BattleController();
        this.captureController = new CaptureController();
        this.gardenController = new GardenController();
        this.evolutionController = new EvolutionController();
        this.playerInformationController = new PlayerInformationController();
        this.saveController = new SaveController();
        this.endingController = new EndingController();
        this.helpController = new HelpController();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    public void start() {
        outputView.welcome();

        while (true) {
            endingController.check();

            // TODO : 프로그램 실행시 유저
            File fileInfo = new File(PATH);
            if (!fileInfo.exists()) fileInfo.mkdir();

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

                case EVOLUTION_MENU:
                    outputView.evolution();
                    evolutionController.start();
                    break;

                case INFORMATION_MENU:
                    outputView.information();
                    playerInformationController.start();
                    break;

                case SAVE_MENU:
                    outputView.save();
                    saveController.start();
                    break;

                case HELP_MENU:
                    outputView.help();
                    helpController.help();
                    break;

                case EXIT_MENU: // TODO : 0번으로 수정
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
