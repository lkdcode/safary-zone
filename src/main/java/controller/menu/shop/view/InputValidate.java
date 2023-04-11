package controller.menu.shop.view;

import User.item.ball.MonsterBall;
import User.item.berry.Berry;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {
    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";
    private final String EXIT_MENU = "0";
    private final int MIN_QUANTITY = 1;
    private final int MAX_QUANTITY = 99;
    private final int ERROR_QUANTITY = 0;

    public boolean menuNumber(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(EXIT_MENU)) {
            return true;
        }
        return false;
    }

    public MonsterBall monsterBallNumber(String inputMonsterBallNumber) {
        if (inputMonsterBallNumber.equals(FIRST_MENU)) return MonsterBall.NORMAL;
        if (inputMonsterBallNumber.equals(SECOND_MENU)) return MonsterBall.HYPER;
        if (inputMonsterBallNumber.equals(THIRD_MENU)) return MonsterBall.MASTER;

        return null;
    }

    public Berry BerryNumber(String inputBerryNumber) {
        if (inputBerryNumber.equals(FIRST_MENU)) return Berry.RASPBERRY;
        if (inputBerryNumber.equals(SECOND_MENU)) return Berry.BLUEBERRY;
        if (inputBerryNumber.equals(THIRD_MENU)) return Berry.BLACKBERRY;

        return null;
    }

    public int quantity(String inputQuantity) {
        int quantity;
        try {
            quantity = Integer.parseInt(inputQuantity);
            if (!(quantity >= MIN_QUANTITY && quantity <= MAX_QUANTITY)) {
                return ERROR_QUANTITY;
            }
        } catch (NumberFormatException e) {
            return ERROR_QUANTITY;
        }
        return quantity;
    }
}
