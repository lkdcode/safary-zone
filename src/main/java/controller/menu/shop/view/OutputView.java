package controller.menu.shop.view;

import User.item.ball.MonsterBall;
import User.item.berry.Berry;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {
    private final String WELCOME_MESSAGE = "🏪 상점에 오신 걸 환영합니다.";
    private final String FIRST_MENU = "1. 🖲️ 몬스터볼 구매";
    private final String SECOND_MENU = "2. 🍓 열매 구매";
    private final String BACK_MENU = "0. 🔙 돌아가기\n";
    private final String BUY_MONSTER_BALL_MENU = "\n# 몬스터 볼 구매 매뉴\n";
    private final String FIRST_BALL = "1. 일반 몬스터 볼 👉 [포획 확률 : ??%]";
    private final String SECOND_BALL = "2. 하이퍼 몬스터 볼 👉 [포획 확률 : ??%]";
    private final String THIRD_BALL = "3. 마스터 몬스터 볼 👉 [포획 확률 : ??%]";
    private final String BUY_BERRY_MENU = "\n# 열매 구매 매뉴\n";
    private final String FIRST_BERRY = "1. 🍓 블루 베리 👉 [일정 확률로 상,하로 열매를 뿌립니다.]";
    private final String SECOND_BERRY = "2. 🫐 라즈 베리 👉 [일정 확률로 좌,우로 열매를 뿌립니다.]";
    private final String THIRD_BERRY = "3. ♣️ 블랙 베리 👉 [일정 확률로 상,하,좌,우로 열매를 뿌립니다.]";
    private final String INPUT_QUANTITY = "구매할 수량을 입력해주세요.";
    private final String BACK = "\n돌아갑니다.\n";
    private final String FAIL_BUY_MONSTER_BALL = "[❌ 몬스터 볼 구매에 실패하였습니다.]";
    private final String FAIL_BUY_BERRY = "[❌ 열매 구매에 실패하였습니다.]";
    private final String SUCCESSFUL_BUY_MONSTER_BALL = "\n[✅ 몬스터 볼 구매에 성공하였습니다.]";
    private final String SUCCESSFUL_BUY_BERRY = "\n[✅ 열매 구매에 성공하였습니다.]";
    private final String BOUGHT_QUANTITY = "구매한 수량 ▶️ ";
    private final String BOUGHT_MONSTER_BALL = "구매한 몬스터 볼 타입 👉 ";
    private final String BOUGHT_BERRY = "구매한 열매 종류 👉 ";

    public void showMenu() {
        print(WELCOME_MESSAGE);
        print(FIRST_MENU);
        print(SECOND_MENU);
        print(BACK_MENU);
    }

    public void showMonsterBallMenu() {
        print(BUY_MONSTER_BALL_MENU);
        print(FIRST_BALL);
        print(SECOND_BALL);
        print(THIRD_BALL);
    }

    public void showBerryMenu() {
        print(BUY_BERRY_MENU);
        print(FIRST_BERRY);
        print(SECOND_BERRY);
        print(THIRD_BERRY);
    }

    public void failBuyMonsterBall() {
        print(FAIL_BUY_MONSTER_BALL);
    }

    public void failBuyBerry() {
        print(FAIL_BUY_BERRY);
    }

    public void successfulBuyMonsterBall(MonsterBall monsterBall, int quantity) {
        // TODO : 구매 후 소지금 출력
        StringBuilder addMessage = new StringBuilder();
        addMessage.append(System.lineSeparator())
                .append(BOUGHT_MONSTER_BALL)
                .append(monsterBall.toString())
                .append(System.lineSeparator())
                .append(BOUGHT_QUANTITY)
                .append(quantity)
                .append(System.lineSeparator());
        print(SUCCESSFUL_BUY_MONSTER_BALL + addMessage);
    }

    public void successfulBuyBerry(Berry berry, int quantity) {
        // TODO : 구매 후 소지금 출력
        StringBuilder addMessage = new StringBuilder();
        addMessage.append(System.lineSeparator())
                .append(BOUGHT_BERRY)
                .append(berry.toString())
                .append(System.lineSeparator())
                .append(BOUGHT_QUANTITY)
                .append(quantity)
                .append(System.lineSeparator());
        print(SUCCESSFUL_BUY_BERRY + addMessage);
    }

    public void inputQuantity() {
        print(INPUT_QUANTITY);
    }

    public void exit() {
        print(BACK);
    }

    private void print(String message) {
        System.out.println(message);
    }
}