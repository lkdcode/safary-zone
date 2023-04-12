package controller.menu.garden.exception;

public enum ErrorMessage {

    GARDEN_MENU("❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.\n"),
    PLANT_LOCATION("❌ 심을 위치를 잘못 선택하였습니다. 5 이내로 입력해주세요.\n"),
    UNKNOWN_ERROR("❌ 알 수 없는 오류가 발생하였습니다. 다시 시도해주세요.\n"),
    NO_BERRY_ERROR("❌ 선택한 열매가 없습니다. 다른 열매를 심거나, 상점에서 구입해주세요.\n");
    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }

}
