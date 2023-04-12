package controller.menu.capture.controller;

import controller.menu.capture.exception.ErrorMessage;
import controller.menu.capture.view.InputView;
import controller.menu.capture.view.OutputView;

/**
 * 포획 controller
 */
public class CaptureController {

    private final OutputView outputView;
    private final InputView inputView;

    public CaptureController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    /**
     * - Capture 메인메뉴
     * 1. 포획
     * 2. 다가간다
     * 3. 도망간다
     */
    public void CaptureMenu() {

        //호출했을 때 랜덤으로 시간을 둬서 몬스터와 조우
//        randomEncounter();

        //조우하고 난 뒤에 메뉴 출력
        outputView.showMenu();
        String menu = inputView.inputMenu();

        switch (menu) {
            case "1":
                captureMonster();
                break;
            case "2":
                goNearMonster();
                break;
            case "3":
                outputView.exit();
                break;
            default:
                ErrorMessage.MENU.print();
        }
    }
    /**
     * 어떤 볼을 쓸지 먼저 보여줍니다.
     * 어떤 볼을 쓸지 고릅니다.
     * 선택한 볼
     * */
    private void captureMonster() {
        outputView.chooseBall();
        String s = inputView.inputMonsterBall();

    }

    private void goNearMonster() {
    }


}
