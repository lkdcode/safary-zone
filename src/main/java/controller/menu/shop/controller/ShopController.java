package controller.menu.shop.controller;

import controller.menu.garden.controller.GardenController;
import controller.menu.garden.service.DeleteBerry;
import user.item.ball.MonsterBall;
import user.item.berry.Berry;
import controller.menu.shop.exception.ErrorMessage;
import controller.menu.shop.service.BuyItem;
import controller.menu.shop.service.ValidateMoney;
import controller.menu.shop.view.InputView;
import controller.menu.shop.view.OutputView;

/**
 * 상점 controller
 */
public class ShopController {
    private final String BUY_MONSTER_BALL_MENU = "1";
    private final String BUY_BERRY_MENU = "2";
    private final String EXIT = "0";


    private final InputView inputView;
    private final OutputView outputView;


    private final ValidateMoney validateMoney;
    private final BuyItem buyItem;
    // test
    private final DeleteBerry deleteBerry;
    // test

    public ShopController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.validateMoney = new ValidateMoney();
        this.buyItem = new BuyItem();
        this.deleteBerry = new DeleteBerry();
    }

    /**
     * - 상점 메인 메뉴
     * 1. outputView 가 매뉴를 출력 합니다.
     * 2. inputView 가 매뉴 번호를 입력 받습니다.
     * 3. 해당 매뉴의 메서드를 호출합니다.
     */
    public void menu() {
        while (true) {
            outputView.showMenu();
            String menu = inputView.inputMenu();

            switch (menu) {
                case BUY_MONSTER_BALL_MENU:
                    buyMonsterBallMenu();
                    stop();
                    break;
                case BUY_BERRY_MENU:
                    buyBerryMenu();
                    stop();
                    break;
                case EXIT:
                    outputView.exit();
                    return;
                default:
                    ErrorMessage.MENU.print();
                    stop();
            }
        }

    }

    /**
     * 1. outputView 가 몬스터 볼을 선택하라는 매뉴를 출력합니다.
     * 2. inputView 가 몬스터 볼 매뉴를 입력받습니다.
     * 3. outputView 가 수량을 입력하란 메시지를 출력합니다.
     * 4. inputView 가 수량을 입력 받습니다.
     * 5. validateMoney 가 구매할 몬스터 볼의 총 가격과 현재 소지금을 비교합니다.
     * 6. 구매금이 충분하다면
     *      - buyItem 이 인벤토리에 접근하여 몬스터볼 구매 수량만큼 추가합니다.
     *      - outputView 가 구매에 성공했다는 메시지를 출력합니다.
     * 8. 구매금이 부족하다면
     *      - outputView 가 구매에 실패했다는 메시지를 출력합니다.
     *
     */
    private void buyMonsterBallMenu() {
        // test
        deleteBerry.deleteBerry();
        // test
        outputView.showMonsterBallMenu();
        MonsterBall inputMonsterBallType = inputView.inputMonsterBallNumber();
        outputView.inputQuantity();
        int quantity = inputView.inputQuantity();

        // true 면 구매가능, false 면 구매불가
        if (validateMoney.isEnoughMoney(inputMonsterBallType, quantity)) {
            buyItem.addMonsterBall(inputMonsterBallType, quantity);
            outputView.successfulBuyMonsterBall(inputMonsterBallType, quantity);
        } else {
            outputView.failBuyMonsterBall();
        }
    }

    /**
     * 위와 같은 로직.
     */
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

    private void stop() {
        outputView.stopMessage();
        inputView.stopInput();
    }
}
