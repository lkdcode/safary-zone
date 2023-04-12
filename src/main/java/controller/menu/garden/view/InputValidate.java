package controller.menu.garden.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final String GARDEN_FIRST_MENU = "1";
    private final String GARDEN_SECOND_MENU = "2";
    private final String BACK_MENU = "0";

    public boolean menuNumber(String input) {
        if (input.equals(GARDEN_FIRST_MENU) || input.equals(GARDEN_SECOND_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }
}
