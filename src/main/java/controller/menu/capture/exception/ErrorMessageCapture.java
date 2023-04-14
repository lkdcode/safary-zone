package controller.menu.capture.exception;

public enum ErrorMessageCapture {

    INPUT_MENU("❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.\n"),
    INPUT_MY_BALL("❌ 몬스터 볼 이름을 잘 못 입력하였습니다. 다시 입력해주세요.\n"),
    ;
    private String message;

    ErrorMessageCapture(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }

}
