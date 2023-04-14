package controller.menu.capture.exception;

public enum ErrorMessage {
    MENU("❌ 다시 입력해주세요!❌");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(MENU.message);
    }

}
