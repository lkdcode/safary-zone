package controller.menu.garden.controller;

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

    public GardenController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
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
                    break;
                case EXIT :
                    break;
                default:
            }
        }
    }
}
