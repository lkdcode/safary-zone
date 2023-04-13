package controller.menu.garden.controller;

import controller.menu.garden.exception.ErrorMessage;
import controller.menu.garden.service.*;
import controller.menu.garden.view.InputView;
import controller.menu.garden.view.OutputView;
import controller.menu.shop.controller.ShopController;

/**
 * 정원 controller
 */
public class GardenController {

    private final String CHECK_MY_GARDEN = "1";
    private final String PLANTING_BERRY = "2";
    private final String EXIT = "0";
    private final InputView inputView;
    private final OutputView outputView;
    private final PlantingBerry plantingBerry;

    public GardenController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.plantingBerry = new PlantingBerry();
    }

    /**
     * 열매심기 메인메뉴입니다.
     * 1 을 입력하면 플레이어의 현재 정원 상태를 보여주고
     * 2 를 입력하면 내 정원에 열매를 심을 수 있습니다.
     * 0 을 입력하면 시작메뉴로 돌아갑니다.
     * 잘못된 문자를 입력하면 오류 메세지가 출력되고 재입력 요청합니다.
     */
    public void menu() {
        while(true) {
            outputView.showGardenMenu();
            String menu = inputView.inputMenu();
            switch (menu) {
                case CHECK_MY_GARDEN :
                    outputView.showMyGarden();
                    break;
                case PLANTING_BERRY :
                    plantingMenu();
                    break;
                case EXIT :
                    // test
                    ShopController shopController = new ShopController();
                    shopController.menu();
                    // test
//                    outputView.exit();
                    return;
                default:
                    ErrorMessage.GARDEN_MENU.print();
            }
        }
    }

    /**
     * 2. 열매 심기
     * 플레이어가 소지 중인 열매를 정원에 심을 수 있습니다.
     * 1 입력시 라즈베리 심기
     * 2 입력시 블루베리 심기
     * 3 입력시 블랙베리 심기가 실행됩니다.
     * 성공적으로 열매를 심으면 심은 뒤의 정원을 출력하고, 또 열매를 심을지 이전메뉴로 돌아갈지 묻습니다.
     * 잘못된 문자를 입력하면 오류 메세지가 출력되고 재입력 요청합니다.
     */
    public void plantingMenu() {
        while (true) {
            outputView.showMyGarden();
            outputView.showPlantingMenu();
            String menu = inputView.inputPlantingMenu();
            switch (menu) {
                case "1": // 블루베리 심기
                    plantingBerry.plantingBlueBerry();
                    break;
                case "2": // 라즈베리 심기
                    plantingBerry.plantingRaspBerry();
                    break;
                case "3": // 블랙베리 심기
                    plantingBerry.plantingBlackBerry();
                    break;
                case EXIT: // 이전 메뉴로 돌아가기
                    outputView.exit();
                    return;
                default:
                    ErrorMessage.GARDEN_MENU.print();
            }
            // 심은 뒤 정원을 출력하고, 더 심을지 확인
            outputView.showMyGarden();
            String answer = inputView.plantingMore();
            // 더 심을거면 베리 선택 메뉴로 돌아가기
            if (answer.equals("1")) continue;
            // 그만 심을거면 메인 메뉴로 돌아가기
            if (answer.equals("2")) return;
        }
    }

}
