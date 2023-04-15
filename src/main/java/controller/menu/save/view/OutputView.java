package controller.menu.save.view;

/**
 * 콘솔에 출력하는 역할
 */
import static common.MakeCommon.dottedPrint;

public class OutputView {

    private final String LOAD_FILE_NAME = "\n💾 불러올 파일의 이름 입력 👉 ";
    private final String SAVE_FILE_NAME = "\n💾 저장할 파일의 이름 입력 👉 ";
    private final String FILE_NAME_LENGTH = "\n✔ 파일 이름은 15자 이내로 입력해주세요.\n";
    private final String WELCOME_SAVELOAD = "💿 저장/불러오기 매뉴입니다.\n";
    private final String SAVE = "1. 📌 저장하기\n";
    private final String LOAD = "2. 💽 불러오기\n";
    private final String EXIT = "0. 🔙 돌아가기\n";
    private final String EXIT_MAIN = "\n메인 메뉴로 돌아갑니다. 🔙\n\n";
    private final String SAVE_SUCCESS = "\n✔ 저장이 완료되었습니다.\n\n";
    private final String LOAD_SUCCESS = "\n.✔ 불러오기가 완료되었습니다.\n\n돌아오신 걸 환영합니다! 😊✋\n";
    private final int MILLIS = 30;
    private final int SHORT_MILLS = 10;

    public void loadFile() {
        dottedPrint(LOAD_FILE_NAME, SHORT_MILLS);
    }

    public void saveFile() {
        dottedPrint(SAVE_FILE_NAME, SHORT_MILLS);
    }

    // TODO : 에러메세지로 옮기기
    public void NameLengthEmergency() {
        dottedPrint(FILE_NAME_LENGTH, SHORT_MILLS);
    }

    public void choiceMenu() {
        String message = WELCOME_SAVELOAD + SAVE + LOAD + EXIT;
        dottedPrint(message, MILLIS);
    }

    public void exit() {
        dottedPrint(EXIT_MAIN, MILLIS);
    }

    public void saveSuccess() {
        dottedPrint(SAVE_SUCCESS, MILLIS);
    }

    public void loadSuccess() {
        dottedPrint(LOAD_SUCCESS, MILLIS);
    }
}