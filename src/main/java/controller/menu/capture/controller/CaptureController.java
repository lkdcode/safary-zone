package controller.menu.capture.controller;


import controller.menu.capture.service.CaptureServiceLogic;
import controller.menu.capture.view.InputView;
import controller.menu.capture.view.OutputView;
import user.Player;
import user.item.ball.MonsterBall;

/**
 * 포획 controller
 */
public class CaptureController {
    private final InputView inputView;
    private final OutputView outputView;
    private CaptureServiceLogic captureServiceLogic;
    private final String THROW_BALL_MENU = "1";
    private final String GO_NEAR_MENU = "2";
    private final String EXIT_MENU = "0";

    public CaptureController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void start() {
        this.captureServiceLogic = new CaptureServiceLogic();
        String wildPokemonName = captureServiceLogic.getWildPokemonName();
        outputView.ready(wildPokemonName);

        while (true) {
            outputView.menu();
            String inputMenuNumber = inputView.menu();
            switch (inputMenuNumber) {
                case THROW_BALL_MENU:
                    outputView.showBallList(myBallList());
                    MonsterBall throwBall = inputView.choiceMyBall();

                    if (!validateBallQuantity(throwBall)) {
                        outputView.notEnoughQuantity(throwBall);
                        break;
                    }
                    outputView.throwBall(wildPokemonName, throwBall);

                    if (captureServiceLogic.throwBall(throwBall)) {
                        outputView.successCapture(wildPokemonName, captureServiceLogic.isAlready());
                        return;
                    }

                    outputView.failCapture();
                    break;

                case GO_NEAR_MENU:
                    outputView.goNear();

                    if (!captureServiceLogic.isNearSuccess()) {
                        outputView.runAway(wildPokemonName);
                        return;
                    }
                    outputView.successGoNear();
                    break;

                case EXIT_MENU:
                    outputView.exit();
                    return;
                default:
                    if (captureServiceLogic.isRun()) {
                        outputView.runAway(wildPokemonName);
                        return;
                    }
            }

        }
    }

    /**
     * 유저가 입력한(사용하고자 하는) 몬스터 볼의 수량을 검사합니다.
     * 0개가 있다면 사용할 수 없도록 리턴합니다.
     *
     * @param inputBallName : 유저가 사용하고자하는 몬스터볼
     * @return
     */
    private boolean validateBallQuantity(MonsterBall inputBallName) {
        if (Player.getInstance().getInventory().getBallPouch().getBallPouch().get(inputBallName) == 0) return false;
        return true;
    }

    /**
     * 유저가 보유하고 있는 몬스터 볼 리스트를 문자열로 리턴합니다.
     *
     * @return
     */
    private String myBallList() {
        return Player.getInstance().getInventory().getBallPouch().getBallList();
    }

}
