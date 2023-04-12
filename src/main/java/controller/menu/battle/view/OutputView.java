package controller.menu.battle.view;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {

    private final String WELCOM = "포켓몬 전투가 시작됩니다.";
    private final String GO_MY_POKEMON = "가라 꼬부기!!";
    private final String INPUT_MENE = "매뉴를 선택해주세요.";

    public OutputView() {
    }

    public void menu() {
        System.out.println("잠시 후 포켓몬과의 전투가 시작됩니다.");
        System.out.println("### 포켓몬 등장 ###");
        System.out.println("야생의 파이리가 등장하였습니다.");
        System.out.println("매뉴를 선택해주세요.");
    }

    public void print(String message) {
        System.out.printf(message);
    }
}