package controller.menu.garden.exception;

/**
 * 열매 심기 메뉴의 오류메세지를 모아둔 enum 입니다.
 */
public enum ErrorMessage {

    GARDEN_MENU("❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.\n"),
    PLANT_LOCATION("❌ 심을 위치를 잘못 선택하였습니다. 1 ~ 5 사이로 입력해주세요.\n"),
    UNKNOWN_ERROR("❌ 알 수 없는 오류가 발생하였습니다. 다시 시도해주세요.\n"),
    NO_BERRY_ERROR("❌ 선택한 열매가 없습니다. 다른 열매를 심거나, 상점에서 구입해주세요.\n"),
    ALREADY_PLANTED_ERROR("❌ 이미 열매가 심어져있는 곳입니다. 다른 곳에 심어주세요.\n");
    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }

}
