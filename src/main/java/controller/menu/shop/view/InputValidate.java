package controller.menu.shop.view;

import user.item.ball.MonsterBall;
import user.item.berry.Berry;

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

    /**
     * 유저로부터 입력받은 상점 매뉴의 유효성 검사를 합니다.
     * 현재 매뉴는 1. 몬스터볼 구매하기, 2. 열매 구매하기, 3. 돌아가기 이기 때문에
     * 그 값을 비교해서 boolean 타입으로 리턴합니다.
     * @param input : 유저로부터 입력받은 매뉴 번호
     * @return : 올바른 값을 입력하면 true, 잘못된 값을 입력하면 false
     */
    public boolean menuNumber(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(EXIT_MENU)) {
            return true;
        }
        return false;
    }

    /**
     * 유저로부터 입력받은 몬스터볼 매뉴 번호의 유효성 검사를 합니다.
     * 현재 매뉴는 1,2,3 총 3개이므로 해당 번호일 때 MonsterBall 을 리턴합니다.
     * 그 외의 잘 못된 값은 null 을 리턴합니다.
     * @param inputMonsterBallNumber : 유저로부터 입력받은 몬스터 볼 매뉴 번호
     * @return : 1, 2, 3 중에 하나일 경우 해당 번호에 알맞는 몬스터 볼을 리턴, 잘못된 값은 null을 리턴합니다.
     */
    public MonsterBall monsterBallNumber(String inputMonsterBallNumber) {
        if (inputMonsterBallNumber.equals(FIRST_MENU)) return MonsterBall.NORMAL;
        if (inputMonsterBallNumber.equals(SECOND_MENU)) return MonsterBall.HYPER;
        if (inputMonsterBallNumber.equals(THIRD_MENU)) return MonsterBall.MASTER;

        return null;
    }

    /**
     * 몬스터볼과 같은 로직입니다.
     * @param inputBerryNumber : 유저로부터 입력받은 열매 매뉴 번호
     * @return : 1, 2, 3 중에 하나일 경우 해당 번호에 알맞는 열매를 리턴, 잘못된 값은 null을 리턴합니다.
     */
    public Berry BerryNumber(String inputBerryNumber) {
        if (inputBerryNumber.equals(FIRST_MENU)) return Berry.BLUEBERRY;
        if (inputBerryNumber.equals(SECOND_MENU)) return Berry.RASPBERRY;
        if (inputBerryNumber.equals(THIRD_MENU)) return Berry.BLACKBERRY;

        return null;
    }

    /**
     * 유저로부터 입력받은 수량에 대한 유효성 검사를 진행합니다.
     * 1. parseInt 메서드를 통해 int 로 타입을 변환합니다.
     *      - exception 발생 시 catch 해서 에러 수량(0개)을 리턴합니다.
     * 2. parseInt 에 성공하고나면 최소 구매 수량과 최대 구매 수량 범위에 존재하는지 확인합니다.
     * @param inputQuantity : 유저로부터 입력받은 String 타입의 수량
     * @return : 위의 로직을 통과하면 올바른 수량을 리턴, 통과하지 못 하면 ERROR_QUANTITY(0)를 리턴합니다.
     */
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
