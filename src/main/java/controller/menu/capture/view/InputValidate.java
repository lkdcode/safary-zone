package controller.menu.capture.view;

import user.item.ball.MonsterBall;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {
    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";
    private final String EXIT_MENU = "0";

    public boolean menuNumber(String inputMenuNumber) {
        if (inputMenuNumber.equals(FIRST_MENU) || inputMenuNumber.equals(SECOND_MENU) || inputMenuNumber.equals(EXIT_MENU)) {
            return true;
        }
        return false;
    }

    public MonsterBall chooseMonsterBall(String inputMonsterBall){
        if(inputMonsterBall.equals("1")) return MonsterBall.NORMAL;
        if(inputMonsterBall.equals("2")) return MonsterBall.HYPER;
        if(inputMonsterBall.equals("3")) return MonsterBall.MASTER;

        return null;
    }


}
