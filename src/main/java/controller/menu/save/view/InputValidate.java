package controller.menu.save.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final int NAME_LENGTH_MAX = 15;
    private final int NAME_LENGTH_MIN = 1;
    private final String FIRST_MENU = "1";
    private final String SECOND_MENU = "2";
    private final String BACK_MENU = "0";
    public InputValidate() {
    }

    /**
     * 파일 이름을 1자 이상, 15자 이내로 입력했는지 검사합니다.
     * @param fileName : 사용자가 저장 또는 불러오기 원하는 파일 이름
     * @return 1자 이하, 15자 초과일 시 false, 잘 입력되면 true를 리턴합니다.
     */
    public boolean inputFileNameValidate(String fileName) {
        if (fileName.length() > NAME_LENGTH_MAX || fileName.length() < NAME_LENGTH_MIN) {
            return false;
        }
        return true;
    }

    /**
     * 입력한 메뉴 숫자가 메뉴 범위에 포함되는지 검사합니다.
     * @param input
     * @return 메뉴 범위에 포함되면 true, 메뉴에 포함되지 않은 숫자나 문자를 입력하면 false 를 리턴합니다.
     */
    public boolean menuNumberValidate(String input) {
        if (input.equals(FIRST_MENU) || input.equals(SECOND_MENU) || input.equals(BACK_MENU))
            return true;
        return false;
    }
}
