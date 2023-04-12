package controller.menu.capture.controller;

import controller.menu.capture.exception.ErrorMessage;
import controller.menu.capture.view.InputView;
import controller.menu.capture.view.OutputView;
import user.item.ball.MonsterBall;

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
//      pokemon ??=  randomEncounter();



//        outputView.showStatus(pokemon);
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
            case "0":
                outputView.exit();
                break;
            default:
                ErrorMessage.MENU.print();
        }
    }

    /**
     * 어떤 볼을 쓸지 먼저 보여줍니다.
     * 어떤 볼을 쓸지 고릅니다.
     */
    private void captureMonster() {

        outputView.chooseBall();
        // 몬스터볼, 하이퍼볼, 마스터볼

        // 셋 중에서 고르기
        MonsterBall monsterBall = inputView.inputMonsterBall(); //몬스터볼

        //고른 몬스터볼을 던지면 볼의 확률에 따라 포획여부 결정



    }

    private void goNearMonster() {
    }


}
