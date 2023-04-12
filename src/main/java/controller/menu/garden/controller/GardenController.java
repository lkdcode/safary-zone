package controller.menu.garden.controller;

import controller.menu.garden.exception.ErrorMessage;
import controller.menu.garden.service.*;
import controller.menu.garden.view.InputView;
import controller.menu.garden.view.OutputView;

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
    private int[] plantLocation;
    private PlantableRaspBerry plantableRaspBerry;
    private PlantableBlueBerry plantableBlueBerry;
    private PlantableBlackBerry plantableBlackBerry;
    private int row;
    private int column;

    public GardenController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.plantingBerry = new PlantingBerry();
        this.plantLocation = new int[2];
        this.plantableRaspBerry = new PlantableRaspBerry();
        this.plantableBlueBerry = new PlantableBlueBerry();
        this.plantableBlackBerry = new PlantableBlackBerry();
    }

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
                    break;
                default:
            }
        }
    }

    public void plantingMenu() {
        while (true) {
            outputView.showPlantingMenu();
            String menu = inputView.inputPlantingMenu();
            switch (menu) {
                case "1": // 라즈베리 심기
                    plantingBerry.plantingRaspBerry();
                    break;
                case "2": // 블루베리 심기
                    plantingBerry.plantingBlueBerry();
                    break;
                case "3": // 블랙베리 심기
                    plantingBerry.plantingBlackBerry();
                    break;
                case "0": // 이전 메뉴로 돌아가기
                    menu();
                    break;
                default:
                    ErrorMessage.GARDEN_MENU.print();
            }
            // 심은 뒤 정원을 출력하고, 더 심을지 확인
            outputView.showMyGarden();
            String answer = inputView.plantingMore();
            // 더 심을거면 베리 선택 메뉴로 돌아가기
            if (answer.equals("1")) continue;
            // 그만 심을거면 메인 메뉴로 돌아가기
            if (answer.equals("2")) menu();
        }
    }
    private int[] plantLocationSelect() {
        outputView.showMyGarden();
        outputView.rowAndColumn("↔ 가로"); // row
        plantLocation[0] = inputView.inputPlantLocation();
        outputView.rowAndColumn("↕ 세로"); // column
        plantLocation[1] = inputView.inputPlantLocation();
        return plantLocation;
    }


}
