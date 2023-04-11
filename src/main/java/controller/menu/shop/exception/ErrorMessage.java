package controller.menu.shop.exception;

public enum ErrorMessage {
    MENU("❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.%n"),
    QUANTITY("❌ 최소 수량은 1개, 최대 수량은 99개 입니다.");
    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.printf(MENU.message);
    }

}
