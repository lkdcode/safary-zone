package controller.menu.capture.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String THIRD_MENU = "3";
    private final String NORMAL = "NORMAL";
    private final String MASTER = "MASTER";
    private final String HYPER = "HYPER";

    public boolean menu(String inputMenu) {
        if (inputMenu.equals(FIRST_MENU)
                || inputMenu.equals(SECOND_MENU)
                || inputMenu.equals(THIRD_MENU)) return true;
        return false;
    }

    public boolean ballName(String inputBallName) {
        if (inputBallName.equalsIgnoreCase(NORMAL)
                || inputBallName.equalsIgnoreCase(HYPER)
                || inputBallName.equalsIgnoreCase(MASTER))
            return true;
        return false;
    }
}
