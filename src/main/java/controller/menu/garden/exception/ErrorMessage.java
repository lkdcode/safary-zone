package controller.menu.garden.exception;

public enum ErrorMessage {

    GARDEN_MENU("❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.%n");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }

}
