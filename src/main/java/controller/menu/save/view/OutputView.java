package controller.menu.save.view;

/**
 * 콘솔에 출력하는 역할
 */
import static common.MakeCommon.dottedPrint;

public class OutputView {

    private final String LOAD_FILE_NAME = "💾 불러올 파일의 이름 입력 👉 ";
    private final String SAVE_FILE_NAME = "💾 저장할 파일의 이름 입력 👉 ";
    private final String FILE_NAME_LENGTH = "✔ 파일 이름은 15자 이내로 입력해주세요.";
    private final int MILLIS = 30;
    private final int SHORT_MILLS = 10;

    public void loadFileName() {
        dottedPrint(LOAD_FILE_NAME, SHORT_MILLS);
    }

    public void saveFileName() {
        dottedPrint(SAVE_FILE_NAME, SHORT_MILLS);
    }

    public void NameLengthEmergency() {
        dottedPrint(FILE_NAME_LENGTH, SHORT_MILLS);
    }

}