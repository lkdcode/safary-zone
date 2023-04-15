package safaryzone.controller.menu.battle.exception;

public enum ErrorMessageBattle {

    INPUT_MENU("❌ 매뉴 번호를 잘 못 입력하였습니다. 다시 입력해주세요.\n"),
    INPUT_MY_POKEMON_NAME("❌ 포켓몬 이름을 잘 못 입력하였습니다. 다시 입력해주세요.\n"),
    ;
    private String message;

    ErrorMessageBattle(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void print() {
        System.out.println(this.message);
    }
}
