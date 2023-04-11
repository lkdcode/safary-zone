package controller.menu.shop.controller;

import User.item.ball.MonsterBall;
import User.item.berry.Berry;
import controller.menu.shop.exception.ErrorMessage;
import controller.menu.shop.service.BuyItem;
import controller.menu.shop.service.ValidateMoney;
import controller.menu.shop.view.InputView;
import controller.menu.shop.view.OutputView;

/**
 * 상점 controller
 */
public class ShopController {
    private final InputView inputView;
    private final OutputView outputView;
    private final ValidateMoney validateMoney;
    private final BuyItem buyItem;

    public ShopController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.validateMoney = new ValidateMoney();
        this.buyItem = new BuyItem();
    }

    public void menu() {
        while (true) {
            outputView.showMenu();
            String menu = inputView.inputMenu();

            switch (menu) {
                case "1":
                    buyMonsterBallMenu();
                    break;
                case "2":
                    buyBerryMenu();
                    break;
                case "0":
                    outputView.exit();
                    return;
                default:
                    ErrorMessage.MENU.print();
            }
        }

    }

    private void buyMonsterBallMenu() {
        outputView.showMonsterBallMenu();
        MonsterBall inputMonsterBallType = inputView.inputMonsterBallNumber();
        outputView.inputQuantity();
        int quantity = inputView.inputQuantity();

        if (validateMoney.isEnoughMoney(inputMonsterBallType, quantity)) {
            buyItem.addMonsterBall(inputMonsterBallType, quantity);
            outputView.successfulBuyMonsterBall(inputMonsterBallType, quantity);
        } else {
            outputView.failBuyMonsterBall();
        }
    }

    private void buyBerryMenu() {
        outputView.showBerryMenu();
        Berry inputBerryType = inputView.inputBerryNumber();
        outputView.inputQuantity();
        int quantity = inputView.inputQuantity();

        if (validateMoney.isEnoughMoney(inputBerryType, quantity)) {
            buyItem.addBerry(inputBerryType, quantity);
            outputView.successfulBuyBerry(inputBerryType, quantity);
        } else {
            outputView.failBuyBerry();
        }
    }
}
