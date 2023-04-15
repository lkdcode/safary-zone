package controller.menu.save.exception;

import static common.MakeCommon.dottedPrint;

public enum ErrormessageSave {

    INPUT_MENU("\n❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.\n\n"),
    SAVE_ERROR_MESSAGE("\n❌ 저장에 실패하였습니다...\n\n"),
    LOAD_ERROR_MESSAGE("\n❌ 불러오기에 실패하였습니다...\n\n"),
    NAME_LENGTH_OVER("\n❌ 파일 이름은 1 ~ 15자 사이로 입력해주세요\n\n"),
    UNKNOWN_ERROR("\n❌ 알 수 없는 에러가 발생하였습니다.\n\n");

    private final int MILLIS = 30;
    private String message;

    ErrormessageSave(String message) {
        this.message = message;
    }

    public void print() {
        dottedPrint(message, MILLIS);
    }

}
