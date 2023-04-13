package controller.menu.garden.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";
    private final String BACK_MENU = "0";

    /**
     * 입력한 메뉴 숫자가 메뉴 범위에 포함되는지 검사합니다.
     * @param input
     * @return 메뉴 범위에 포함되면 true, 메뉴에 포함되지 않은 숫자나 문자를 입력하면 false 를 리턴합니다.
     */
    public boolean answerValidate(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU))
            return true;
        return false;
    }

    // 위와 동일
    public boolean menuNumberValidate(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }

    // 위와 동일
    public boolean PlantingMenuNumberValidate(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(THIRD_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }

    /**
     * 열매를 심을 위치 (행과 열)가 1 ~ 5 사이의 정수가 맞는지 검사합니다.
     * @param rowOrColumn: 플레이어가 입력한 행 또는 열 위치
     * @return 입력한 값이 1 ~ 5 사이 정수이면 true, 포함되지 않은 정수를 입력하면 false 를 리턴합니다.
     */
    public boolean PlantingLocationValidate(int rowOrColumn) {
        if (rowOrColumn > 0 && rowOrColumn < 6) return true;
        return false;
    }


}
