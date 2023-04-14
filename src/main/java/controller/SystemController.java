package controller;


import controller.menu.battle.controller.BattleController;
import controller.menu.capture.controller.CaptureController;
import controller.menu.collector.controller.CollectorController;
import controller.menu.garden.controller.GardenController;
import controller.menu.playerinformation.controller.PlayerInformationController;
import controller.menu.save.controller.SaveController;
import controller.menu.shop.controller.ShopController;

import java.util.Scanner;

/**
 * main controller
 */
public class SystemController {

    private final OutputView outputView;
    private final InputView inputView;
    private ShopController shopController;
    private GardenController gardenController;
    private CaptureController captureController;
    private BattleController battleController;
    private PlayerInformationController playerInformationController;
    private SaveController saveController;


    public SystemController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
        this.shopController = new ShopController();
        this.gardenController =new GardenController();
        this.captureController = new CaptureController();
        this.battleController = new BattleController();
        this.playerInformationController = new PlayerInformationController();
        this.saveController = new SaveController();
    }

    public void start() {

        outputView.menu();

        String menuNumber = inputView.selectMenu();

        switch (menuNumber) {
            case ("1"): //상점
                shopController.menu();
                break;
            case ("2")://정원
                gardenController.menu();
                break;
            case ("3"): //포획
                captureController.captureMenu();
                break;
            case ("4"): //배틀
                battleController.start();
                break;
            case ("5"): //프로필
                playerInformationController.start();
                break;
            case ("6"): //저장
//                saveController.
                break;
            case ("7"): //나가기
                System.out.println("게임을 종료합니다");
                System.exit(0);
        }
    }
}
