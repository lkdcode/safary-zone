package controller.menu.garden.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";
    private final String BACK_MENU = "0";

    public boolean answerValidate(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU))
            return true;
        return false;
    }

    public boolean menuNumber(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }

    public boolean PlantingMenuNumber(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(THIRD_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }

    public boolean PlantingLocation(int rowOrColumn) {
        if (rowOrColumn > 0 && rowOrColumn < 6) return true;
        return false;
    }


}
