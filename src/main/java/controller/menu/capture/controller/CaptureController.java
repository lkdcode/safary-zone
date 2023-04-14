package controller.menu.capture.controller;

import controller.menu.capture.exception.ErrorMessage;
import controller.menu.capture.service.CaptureServiceLogic;
import controller.menu.capture.view.InputView;
import controller.menu.capture.view.OutputView;
import user.item.ball.MonsterBall;

/**
 * 포획 controller
 */
public class CaptureController {

    private final CaptureServiceLogic captureServiceLogic;
    private final OutputView outputView;
    private final InputView inputView;

    public CaptureController() {
        this.captureServiceLogic = new CaptureServiceLogic();
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }

    /**
     * - Capture 메인메뉴
     * 1. 포획
     * 2. 다가간다
     * 3. 도망간다
     */
    public void captureMenu() {

        while (true) {
            //2. 세 가지 메뉴를 보여주고 선택을 입력받는다
            outputView.menu();
            String menu = inputView.menu();

            switch (menu) {
                case "1":
                    outputView.selectBall();
                    inputView.selectBall();

//                    String ballNumber = inputView.selectBall();

                    break;
                case "2":
//                    goNearMonster();
                    break;
                case "3":
                    outputView.exit();
                    return;
            }
        }
    }

    /**
     * 어떤 볼을 쓸지 먼저 보여줍니다.
     * 어떤 볼을 쓸지 고릅니다.
     */


}
