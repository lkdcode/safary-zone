package controller.menu.shop.view;

import User.item.ball.MonsterBall;
import User.item.berry.Berry;
import controller.menu.shop.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {
    private final BufferedReader br;
    private final InputValidate inputValidate;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.inputValidate = new InputValidate();
    }


    /**
     * 유저로부터 상점 메인 매뉴를 입력 받습니다.
     * 입력 받은 값은 inputValidate.menuNumber 메서드를 통해 유효성 검사를 진행합니다.
     * 유효성 검사가 통과되면 입력받은 매뉴를 리턴하고, 값을 잘 못 입력하여 유효성 검사를 통과하지 못한 경우
     * 올바른 값을 입력받을 때까지 반복문을 돕니다.
     * TODO : 종료하고 나가기를 추가할지 고민해봐야할 것 같습니다.
     *
     * @return : 유효성 검사가 통과된 메인 메뉴
     */
    public String inputMenu() {
        while (true) {
            String inputMenuNumber = null;
            try {
                inputMenuNumber = br.readLine();
            } catch (IOException e) {
            }
            if (inputValidate.menuNumber(inputMenuNumber)) return inputMenuNumber;
            ErrorMessage.MENU.print();
        }
    }

    /**
     * 유저로부터 몬스터볼 매뉴 번호를 입력 받습니다.
     * 입력 받은 값은 inputValidate.monsterBallNumber 메서드를 통해 유효성 검사를 진행합니다.
     * 유효성 검사가 통과되면 입력받은 몬스터볼 매뉴 번호를 리턴하고, 값을 잘 못 입력하여 유효성 검사를 통과하지 못한 경우
     * 올바른 값을 입력받을 때까지 반복문을 돕니다.
     *
     * @return : 유효성 검사가 통과된 몬스터 볼 매뉴 번호
     * @ErrorMessage : 입력을 잘 못 했다는 메시지를 출력합니다.
     */
    public MonsterBall inputMonsterBallNumber() {
        while (true) {
            String inputMonsterBallNumber = null;
            try {
                inputMonsterBallNumber = br.readLine();
            } catch (IOException e) {
            }
            MonsterBall monsterBall = inputValidate.monsterBallNumber(inputMonsterBallNumber);

            if (monsterBall != null) return monsterBall;
            ErrorMessage.MENU.print();
        }
    }

    /**
     * inputMonsterBallNumber 메서드와 같은 로직입니다.
     *
     * @return : 유효성 검사가 통과된 열매 매뉴 번호
     * @ErrorMessage : 입력을 잘 못 했다는 메시지를 출력합니다.
     */
    public Berry inputBerryNumber() {
        while (true) {
            String inputBerryNumber = null;
            try {
                inputBerryNumber = br.readLine();
            } catch (IOException e) {
            }
            Berry berry = inputValidate.BerryNumber(inputBerryNumber);

            if (berry != null) return berry;
            ErrorMessage.MENU.print();
        }
    }

    /**
     * 몬스터 볼과 열매를 구매할 때 수량을 입력받습니다.
     * String 으로 입력을 받고 inputValidate.quantity 메서드를 통해
     * int 타입으로 변환하고 동시에 최소 구매 수량과 최대 구매 수량을 체크합니다.
     *
     * @return : 유효성 검사가 통과된 수량 (몬스터 볼, 열매)
     * @ErrorMessage : 입력을 잘 못 했다는 메시지를 출력합니다.
     */
    public int inputQuantity() {
        while (true) {
            String inputQuantity = null;
            try {
                inputQuantity = br.readLine();
            } catch (IOException e) {
            }
            int quantity = inputValidate.quantity(inputQuantity);

            if (quantity != 0) return quantity;
            ErrorMessage.QUANTITY.print();
        }
    }
}
