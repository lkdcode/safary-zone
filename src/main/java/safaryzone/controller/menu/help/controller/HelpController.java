package safaryzone.controller.menu.help.controller;

import safaryzone.controller.menu.help.view.InputView;
import safaryzone.controller.menu.help.view.OutputView;

/**
 * 각 매뉴에 대한 설명서 관리하는 컨트롤러
 */
public class HelpController {
    private final InputView inputView;
    private final OutputView outputView;
    private final String SHOP_HELP = "1";
    private final String GARDEN_HELP = "2";
    private final String CAPTURE_HELP = "3";
    private final String BATTLE_HELP = "4";
    private final String EVOLUTION_HELP = "5";
    private final String INFORMATION_HELP = "6";
    private final String SAVE_HELP = "7";
    private final String HELP_EXIT = "0";

    public HelpController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void help() {
        while (true) {
            outputView.welcome();
            String inputMenu = inputView.menu();

            switch (inputMenu) {
                case SHOP_HELP:
                    outputView.shopHelp();
                    break;
                case GARDEN_HELP:
                    outputView.gardenHelp();
                    break;
                case CAPTURE_HELP:
                    outputView.captureHelp();
                    break;
                case BATTLE_HELP:
                    outputView.battleHelp();
                    break;
                case EVOLUTION_HELP:
                    outputView.evolution();
                    break;
                case INFORMATION_HELP:
                    outputView.informationHelp();
                    break;
                case SAVE_HELP:
                    outputView.saveHelp();
                    break;
                case HELP_EXIT:
                    outputView.exit();
                    return;
            }
        }

    }
}
