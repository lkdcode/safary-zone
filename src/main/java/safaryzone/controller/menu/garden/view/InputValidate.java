package safaryzone.controller.menu.garden.view;

import safaryzone.user.Garden;
import safaryzone.user.Player;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";
    private final String BACK_MENU = "0";
    private Garden garden;

    public InputValidate() {
        garden = Player.getInstance().getGarden();
    }

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
    public boolean plantingMenuNumberValidate(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(THIRD_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }

    /**
     * 열매를 심을 위치 (행과 열)가 1 ~ 5 사이의 정수가 맞는지 검사합니다.
     * @param rowOrColumn: 플레이어가 입력한 행 또는 열 위치
     * @return 입력한 값이 1 ~ 5 사이 정수이면 true, 포함되지 않은 정수를 입력하면 false 를 리턴합니다.
     */
    public boolean plantingLocationValidate(int rowOrColumn) {
        if (rowOrColumn > 0 && rowOrColumn < 6) return true;
        return false;
    }

    /**
     * 열매를 심을 위치가 이미 열매가 심어져 있는 곳인지 검사하여 boolean 값을 리턴합니다.
     *
     * @param row: 플레이어가 입력한 행
     * @param column: 플레이어가 입력한 열
     * @return 이미 열매가 심어져있는 곳이면 false 리턴, 열매가 없는 곳이면 true 리턴
     */
    public boolean plantingBerryValidate(int row, int column) {
        String[][] gardenMap = garden.getMap();
        if (gardenMap[row][column].equals("🌱")) {
            return true;
        }
        return false;
    }


}
