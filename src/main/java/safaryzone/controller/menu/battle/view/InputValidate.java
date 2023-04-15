package safaryzone.controller.menu.battle.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {
    private final String BATTLE_OR_DATAIL_VIEW = "1";
    private final String RUN_OR_SUMMON = "2";

    /**
     * 유저로부터 입력받은 배틀 매뉴의 유효성 검사를 합니다.
     * 현재 매뉴는 1. 싸우기, 2. 도망가기
     * 그 값을 비교해서 boolean 타입으로 리턴합니다.
     *
     * @param input : 유저로부터 입력받은 매뉴 번호
     * @return : 올바른 값을 입력하면 true, 잘못된 값을 입력하면 false
     */
    public boolean menuNumber(String input) {
        if (input.equals(BATTLE_OR_DATAIL_VIEW) || input.equals(RUN_OR_SUMMON)) {
            return true;
        }
        return false;
    }

}
