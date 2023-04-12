package controller.menu.capture.view;

import controller.menu.capture.exception.ErrorMessage;
import controller.menu.capture.view.InputValidate;

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
     * 몬스터와 조우한 뒤 포획 메인 메뉴에서 입력을 받는다.
     * 입력값을 inputValidate를 통해 유효성 검사를 진행한다.
     * 검사에 실패하면 에러 메세지를 보여주준 뒤 다시 입력받도록 유도한다.
     *
     */
    public String inputMenu() {
        while (true) {
            String inputMenuNumber = sc.nextLine();

            if (inputValidate.menuNumber(inputMenuNumber)) return inputMenuNumber;
            ErrorMessage.MENU.print();
        }
    }

    /**
     * 어떤 몬스터볼을 사용할지 압력받습니다.
     * 입력 받은 값에 유효성 검사를 먼저 진행합니다.
     * 통과되면 몬스터볼을 리턴받습니다.
     * */
    public String inputMonsterBall(){
        while(true){
            String inputMonsterBall = sc.nextLine();

            if (inputValidate.menuNumber(inputMonsterBall)) return inputMonsterBall;
            ErrorMessage.MENU.print();
        }
    }


}
