package controller.menu.save.view;

/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {

    private final int NAME_LENGTH_MAX = 15;
    private final int NAME_LENGTH_MIN = 1;
    public InputValidate() {
    }

    /**
     * 파일 이름을 1자 이상, 15자 이내로 입력했는지 검사합니다.
     * @param fileName : 사용자가 저장 또는 불러오기 원하는 파일 이름
     * @return 1자 이하, 15자 초과일 시 false, 잘 입력되면 true를 리턴합니다.
     */
    public boolean inputFileNameValidate(String fileName) {
        if (fileName.length() > NAME_LENGTH_MAX || fileName.length() < NAME_LENGTH_MIN) {
            // TODO : ErrorMessage enum 추가해야합니다.
            System.out.println("❌ 파일 이름은 1 ~ 15자 사이로 입력해주세요");
            return false;
        }
        return true;
    }
}
