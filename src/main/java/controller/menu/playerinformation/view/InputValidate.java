package controller.menu.playerinformation.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";

    public boolean menu(String inputMenu) {
        if (inputMenu.equals(FIRST_MENU)
                || inputMenu.equals(SECOND_MENU)
                || inputMenu.equals(THIRD_MENU)) return true;
        return false;
    }


}
