package controller.menu.capture.view;

import controller.menu.capture.exception.ErrorMessage;
import controller.menu.capture.view.InputValidate;
import user.item.ball.MonsterBall;

import java.io.IOException;
import java.util.Scanner;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {
    private final Scanner sc;
    private final InputValidate inputValidate;

    public InputView() {
        this.sc = new Scanner(System.in);
        this.inputValidate = new InputValidate();
    }

    /**
     * 유저한테서 어떤 메뉴를 실행할지 입력을 받는다.
     * 1. 입력받는다 (메뉴 번호 1 2 3)
     * 2. 유효성 검사 (inputValidate)
     */
    public String menu() {
        while (true) {
            String inputMenuNumber = sc.nextLine();
            if (inputValidate.menuNumber(inputMenuNumber))
                return inputMenuNumber;
            ErrorMessage.MENU.print();
        }
    }

    /**
     * 어떤 몬스터볼을 사용할지 압력받습니다.
     * 입력 받은 값에 유효성 검사를 먼저 진행합니다.
     * 통과되면 몬스터볼을 리턴받습니다.
     */
    public void selectBall() {

    }


}
