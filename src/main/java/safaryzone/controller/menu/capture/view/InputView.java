package safaryzone.controller.menu.capture.view;

import safaryzone.controller.menu.capture.exception.ErrorMessageCapture;
import safaryzone.controller.menu.shop.exception.ErrorMessage;
import safaryzone.user.item.ball.MonsterBall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {

    private final InputValidate inputValidate;
    private final BufferedReader br;
    private final String NORMAL = "NORMAL";
    private final String MASTER = "MASTER";
    private final String HYPER = "HYPER";

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.inputValidate = new InputValidate();
    }

    public String menu() {
        while (true) {
            try {
                String inputMenu = br.readLine();
                if (inputValidate.menu(inputMenu)) return inputMenu;
            } catch (IOException e) {
                e.printStackTrace();
            }
            ErrorMessage.MENU.print();
        }
    }

    public MonsterBall choiceMyBall() {
        while (true) {
            try {
                String inputBallName = br.readLine();
                if (inputValidate.ballName(inputBallName)) {
                    if (inputBallName.equalsIgnoreCase(NORMAL)) return MonsterBall.NORMAL;
                    if (inputBallName.equalsIgnoreCase(HYPER)) return MonsterBall.HYPER;
                    if (inputBallName.equalsIgnoreCase(MASTER)) return MonsterBall.MASTER;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            ErrorMessageCapture.INPUT_MY_BALL.print();
        }
    }
}
