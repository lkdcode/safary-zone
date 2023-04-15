package safaryzone.controller.menu.garden.controller;

import safaryzone.controller.menu.garden.exception.ErrorMessage;
import safaryzone.controller.menu.garden.view.InputView;
import safaryzone.controller.menu.garden.view.OutputView;
import safaryzone.common.MakeCommon;
import safaryzone.controller.menu.garden.service.GardenServiceLogic;
import safaryzone.controller.menu.garden.service.PlantingBerry;

/**
 * 정원 controller
 */
public class GardenController {
    private final GardenServiceLogic gardenServiceLogic;
    private final InputView inputView;
    private final OutputView outputView;
    private final String CHECK_MY_GARDEN = "1";
    private final String PLANTING_BERRY = "2";
    private final String EXIT = "0";
    private final PlantingBerry plantingBerry;
    private final String PLANTING_BLUE_BERRY = "1";
    private final String PLANTING_RASP_BERRY = "2";
    private final String PLANTING_BLACK_BERRY = "3";
    private final String FIRST_MENU = "1";
    private final String BACK = "2";

    public GardenController() {
        this.gardenServiceLogic = new GardenServiceLogic();
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
    public void start() {
        while (true) {
            outputView.showGardenMenu();
            String menu = inputView.inputMenu();
            switch (menu) {
                case CHECK_MY_GARDEN:
                    outputView.showMyGarden();
                    outputView.showMyBerryList();
                    MakeCommon.stopLine();
                    break;
                case PLANTING_BERRY:
                    plantingMenu();
                    MakeCommon.stopLine();
                    break;
                case EXIT:
                    outputView.exit();
                    return;
                default:
                    ErrorMessage.GARDEN_MENU.print();
                    MakeCommon.stopLine();
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
        if (gardenServiceLogic.checkCapacity()) {
            outputView.checkCapacity();
            outputView.showMyGarden();
            return;
        }
        while (true) {
            outputView.showMyGarden();
            outputView.showMyBerryList();
            outputView.showPlantingMenu();
            String menu = inputView.inputPlantingMenu();
            switch (menu) {
                case PLANTING_BLUE_BERRY:
                    plantingBerry.plantingBlueBerry();
                    MakeCommon.stopLine();
                    break;
                case PLANTING_RASP_BERRY:
                    plantingBerry.plantingRaspBerry();
                    MakeCommon.stopLine();
                    break;
                case PLANTING_BLACK_BERRY:
                    plantingBerry.plantingBlackBerry();
                    MakeCommon.stopLine();
                    break;
                case EXIT:
                    outputView.exit();
                    return;
                default:
                    ErrorMessage.GARDEN_MENU.print();
                    MakeCommon.stopLine();
            }
            outputView.showMyGarden();
            String answer = inputView.plantingMore();
            if (answer.equals(FIRST_MENU)) continue;
            if (answer.equals(BACK)) return;
        }
    }

}
